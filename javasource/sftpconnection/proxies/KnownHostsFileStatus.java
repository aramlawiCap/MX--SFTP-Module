// This file was generated by Mendix Modeler.
//
// WARNING: Code you write here will be lost the next time you deploy the project.

package sftpconnection.proxies;

public enum KnownHostsFileStatus
{
	Retrieved(new String[][] { new String[] { "en_US", "Retrieved" } }),
	Validated(new String[][] { new String[] { "en_US", "Validated" } }),
	Manually_set(new String[][] { new String[] { "en_US", "Manually set" } });

	private java.util.Map<String,String> captions;

	private KnownHostsFileStatus(String[][] captionStrings)
	{
		this.captions = new java.util.HashMap<String,String>();
		for (String[] captionString : captionStrings)
			captions.put(captionString[0], captionString[1]);
	}

	public String getCaption(String languageCode)
	{
		if (captions.containsKey(languageCode))
			return captions.get(languageCode);
		return captions.get("en_US");
	}

	public String getCaption()
	{
		return captions.get("en_US");
	}
}
