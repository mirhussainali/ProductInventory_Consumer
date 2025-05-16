package uc2_consumer;

// -----( IS Java Code Template v1.2

import com.wm.data.*;
import com.wm.util.Values;
import com.wm.app.b2b.server.Service;
import com.wm.app.b2b.server.ServiceException;
// --- <<IS-START-IMPORTS>> ---
import com.wm.app.b2b.server.ISRuntimeException;
import com.wm.app.b2b.server.ServiceThread;
import java.net.InetAddress;
import java.net.UnknownHostException;
import java.nio.charset.StandardCharsets;
import java.time.Duration;
// --- <<IS-END-IMPORTS>> ---

public final class utils

{
	// ---( internal utility methods )---

	final static utils _instance = new utils();

	static utils _newInstance() { return new utils(); }

	static utils _cast(Object o) { return (utils)o; }

	// ---( server methods )---




	public static final void getFileSeparator (IData pipeline)
        throws ServiceException
	{
		// --- <<IS-START(getFileSeparator)>> ---
		// @sigtype java 3.5
		// [o] field:0:required fileSeparator
		String fileSeparator = System.getProperty("file.separator" );		
		// pipeline
		IDataCursor pipelineCursor = pipeline.getCursor();
		IDataUtil.put( pipelineCursor, "fileSeparator", fileSeparator );
		pipelineCursor.destroy();
		// --- <<IS-END>> ---

                
	}



	public static final void numberToString (IData pipeline)
        throws ServiceException
	{
		// --- <<IS-START(numberToString)>> ---
		// @sigtype java 3.5
		// [i] object:0:required inputNumber
		// [o] field:0:required outputString
		// pipeline
		
		IDataCursor pipelineCursor = pipeline.getCursor();
		String stringValue = "";
		Object	inputNumber = (Object)IDataUtil.get( pipelineCursor, "inputNumber");
		
		pipelineCursor.destroy();
		
		// pipeline
		IDataCursor pipelineCursor_1 = pipeline.getCursor();
		IDataUtil.put( pipelineCursor_1, "outputString", inputNumber.toString());
		pipelineCursor_1.destroy();
		// --- <<IS-END>> ---

                
	}
}

