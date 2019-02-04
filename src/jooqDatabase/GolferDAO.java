package jooqDatabase;

import static com.golf.Tables.GOLFER;

import org.jooq.Condition;
import org.jooq.DSLContext;
import org.jooq.Record;
import org.jooq.Result;
import org.jooq.SQLDialect;
import org.jooq.impl.DSL;

public class GolferDAO extends DBConnection{

	//create.fetch("SELECT * FROM BOOK WHERE ID = ? AND TITLE = ?", 5, "Animal Farm");
	
	/*
	Condition combined1 = a.or(b);             // These OR-connected conditions form a new condition, wrapped in parentheses
	Condition combined2 = combined1.andNot(c); // The left-hand side of the AND NOT () operator is already wrapped in parentheses
	*/
	
	public Result<Record> selectRecords(String golferName, String golferAddress) {
		setConnection();
        DSLContext create = DSL.using(conn, SQLDialect.POSTGRES);
        Result<Record> result = create.select()
						              .from(GOLFER)
						              .where(DSL.condition(golferName.equals("")).or(GOLFER.GOLFER_NAME.contains(golferName)))
						              .and(DSL.condition(golferAddress.equals("")).or(GOLFER.GOLFER_ADRESS.contains(golferAddress)))
						              .fetch();
        
        System.out.println(create.select()
                          .from(GOLFER)
                          .where(DSL.condition(golferName.equals("")).or(GOLFER.GOLFER_NAME.contains(golferName)))
                          .and(DSL.condition(golferAddress.equals("")).or(GOLFER.GOLFER_ADRESS.contains(golferAddress)))
                          .getSQL());
        
        
		return result;
	}
	
	public Result<Record> selectRecord(Integer golferID) {
		setConnection();
        DSLContext create = DSL.using(conn, SQLDialect.POSTGRES);
        Result<Record> result = create.select()
        		                      .from(GOLFER)
        		                      .where(GOLFER.GOLFER_ID.eq(golferID))
        		                      .fetch();
		return result;
	}

}
