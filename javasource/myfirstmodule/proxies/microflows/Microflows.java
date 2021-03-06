// This file was generated by Mendix Modeler 6.8.
//
// WARNING: Code you write here will be lost the next time you deploy the project.

package myfirstmodule.proxies.microflows;

import java.util.HashMap;
import java.util.Map;
import com.mendix.core.Core;
import com.mendix.core.CoreException;
import com.mendix.systemwideinterfaces.MendixRuntimeException;
import com.mendix.systemwideinterfaces.core.IContext;
import com.mendix.systemwideinterfaces.core.IMendixObject;

public class Microflows
{
	// These are the microflows for the MyFirstModule module
	public static java.util.List<sftpconnection.proxies.SFTPFileDocument> dS_GetDocumentListFromSFTP(IContext context)
	{
		try
		{
			Map<String, Object> params = new HashMap<String, Object>();
			java.util.List<IMendixObject> objs = Core.execute(context, "MyFirstModule.DS_GetDocumentListFromSFTP", params);
			java.util.List<sftpconnection.proxies.SFTPFileDocument> result = null;
			if (objs != null)
			{
				result = new java.util.ArrayList<sftpconnection.proxies.SFTPFileDocument>();
				for (IMendixObject obj : objs)
					result.add(sftpconnection.proxies.SFTPFileDocument.initialize(context, obj));
			}
			return result;
		}
		catch (CoreException e)
		{
			throw new MendixRuntimeException(e);
		}
	}
	public static void iVK_DelKeys(IContext context)
	{
		try
		{
			Map<String, Object> params = new HashMap<String, Object>();
			Core.execute(context, "MyFirstModule.IVK_DelKeys", params);
		}
		catch (CoreException e)
		{
			throw new MendixRuntimeException(e);
		}
	}
	public static void iVK_DownloadFileFromSFTP(IContext context, sftpconnection.proxies.SFTPFileDocument _sFTPFileDocument)
	{
		try
		{
			Map<String, Object> params = new HashMap<String, Object>();
			params.put("SFTPFileDocument", _sFTPFileDocument == null ? null : _sFTPFileDocument.getMendixObject());
			Core.execute(context, "MyFirstModule.IVK_DownloadFileFromSFTP", params);
		}
		catch (CoreException e)
		{
			throw new MendixRuntimeException(e);
		}
	}
	public static void iVK_GetFileDocumentFromSFTPEmptyConfiguration(IContext context)
	{
		try
		{
			Map<String, Object> params = new HashMap<String, Object>();
			Core.execute(context, "MyFirstModule.IVK_GetFileDocumentFromSFTPEmptyConfiguration", params);
		}
		catch (CoreException e)
		{
			throw new MendixRuntimeException(e);
		}
	}
	public static void iVK_GetFileDocumentFromSFTPEmptyFileDocument(IContext context)
	{
		try
		{
			Map<String, Object> params = new HashMap<String, Object>();
			Core.execute(context, "MyFirstModule.IVK_GetFileDocumentFromSFTPEmptyFileDocument", params);
		}
		catch (CoreException e)
		{
			throw new MendixRuntimeException(e);
		}
	}
	public static void iVK_SendDocumentToSFTP(IContext context, system.proxies.FileDocument _fileDocument)
	{
		try
		{
			Map<String, Object> params = new HashMap<String, Object>();
			params.put("FileDocument", _fileDocument == null ? null : _fileDocument.getMendixObject());
			Core.execute(context, "MyFirstModule.IVK_SendDocumentToSFTP", params);
		}
		catch (CoreException e)
		{
			throw new MendixRuntimeException(e);
		}
	}
}