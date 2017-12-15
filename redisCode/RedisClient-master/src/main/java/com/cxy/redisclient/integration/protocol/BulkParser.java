package com.cxy.redisclient.integration.protocol;

import java.io.BufferedReader;
import java.io.IOException;

public class BulkParser extends ReplyParser {

	@Override
	public Result parse(String head, BufferedReader reader) throws IOException {
		int length = Integer.parseInt(head.substring(1, head.length()));
		if(length == -1)
			throw new NullReplyException("NULL Bulk Reply");
		
		char[] value = new char[length];
		
		reader.read(value);
		reader.readLine();
		return new Result(new String(value), ResultType.Bulk);
	}

}
