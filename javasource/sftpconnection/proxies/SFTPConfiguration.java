// This file was generated by Mendix Modeler.
//
// WARNING: Code you write here will be lost the next time you deploy the project.

package sftpconnection.proxies;

public class SFTPConfiguration
{
	private final com.mendix.systemwideinterfaces.core.IMendixObject sFTPConfigurationMendixObject;

	private final com.mendix.systemwideinterfaces.core.IContext context;

	/**
	 * Internal name of this entity
	 */
	public static final java.lang.String entityName = "SFTPConnection.SFTPConfiguration";

	/**
	 * Enum describing members of this entity
	 */
	public enum MemberNames
	{
		ConfigurationName("ConfigurationName"),
		Hostname("Hostname"),
		Port("Port"),
		Username("Username"),
		Password("Password"),
		RemoteSourceFolder("RemoteSourceFolder"),
		RemoteDestinationFolder("RemoteDestinationFolder"),
		KeepRemoteFile("KeepRemoteFile"),
		StrictHostkeyChecking("StrictHostkeyChecking"),
		AuthenticationType("AuthenticationType"),
		SFTPConfiguration_PrivateKey_Connection("SFTPConnection.SFTPConfiguration_PrivateKey_Connection"),
		SFTPConfiguration_KnownHosts("SFTPConnection.SFTPConfiguration_KnownHosts");

		private java.lang.String metaName;

		MemberNames(java.lang.String s)
		{
			metaName = s;
		}

		@Override
		public java.lang.String toString()
		{
			return metaName;
		}
	}

	public SFTPConfiguration(com.mendix.systemwideinterfaces.core.IContext context)
	{
		this(context, com.mendix.core.Core.instantiate(context, "SFTPConnection.SFTPConfiguration"));
	}

	protected SFTPConfiguration(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixObject sFTPConfigurationMendixObject)
	{
		if (sFTPConfigurationMendixObject == null)
			throw new java.lang.IllegalArgumentException("The given object cannot be null.");
		if (!com.mendix.core.Core.isSubClassOf("SFTPConnection.SFTPConfiguration", sFTPConfigurationMendixObject.getType()))
			throw new java.lang.IllegalArgumentException("The given object is not a SFTPConnection.SFTPConfiguration");

		this.sFTPConfigurationMendixObject = sFTPConfigurationMendixObject;
		this.context = context;
	}

	/**
	 * @deprecated Use 'SFTPConfiguration.load(IContext, IMendixIdentifier)' instead.
	 */
	@Deprecated
	public static sftpconnection.proxies.SFTPConfiguration initialize(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixIdentifier mendixIdentifier) throws com.mendix.core.CoreException
	{
		return sftpconnection.proxies.SFTPConfiguration.load(context, mendixIdentifier);
	}

	/**
	 * Initialize a proxy using context (recommended). This context will be used for security checking when the get- and set-methods without context parameters are called.
	 * The get- and set-methods with context parameter should be used when for instance sudo access is necessary (IContext.getSudoContext() can be used to obtain sudo access).
	 */
	public static sftpconnection.proxies.SFTPConfiguration initialize(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixObject mendixObject)
	{
		return new sftpconnection.proxies.SFTPConfiguration(context, mendixObject);
	}

	public static sftpconnection.proxies.SFTPConfiguration load(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixIdentifier mendixIdentifier) throws com.mendix.core.CoreException
	{
		com.mendix.systemwideinterfaces.core.IMendixObject mendixObject = com.mendix.core.Core.retrieveId(context, mendixIdentifier);
		return sftpconnection.proxies.SFTPConfiguration.initialize(context, mendixObject);
	}

	public static java.util.List<sftpconnection.proxies.SFTPConfiguration> load(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String xpathConstraint) throws com.mendix.core.CoreException
	{
		java.util.List<sftpconnection.proxies.SFTPConfiguration> result = new java.util.ArrayList<sftpconnection.proxies.SFTPConfiguration>();
		for (com.mendix.systemwideinterfaces.core.IMendixObject obj : com.mendix.core.Core.retrieveXPathQuery(context, "//SFTPConnection.SFTPConfiguration" + xpathConstraint))
			result.add(sftpconnection.proxies.SFTPConfiguration.initialize(context, obj));
		return result;
	}

	/**
	 * Commit the changes made on this proxy object.
	 */
	public final void commit() throws com.mendix.core.CoreException
	{
		com.mendix.core.Core.commit(context, getMendixObject());
	}

	/**
	 * Commit the changes made on this proxy object using the specified context.
	 */
	public final void commit(com.mendix.systemwideinterfaces.core.IContext context) throws com.mendix.core.CoreException
	{
		com.mendix.core.Core.commit(context, getMendixObject());
	}

	/**
	 * Delete the object.
	 */
	public final void delete()
	{
		com.mendix.core.Core.delete(context, getMendixObject());
	}

	/**
	 * Delete the object using the specified context.
	 */
	public final void delete(com.mendix.systemwideinterfaces.core.IContext context)
	{
		com.mendix.core.Core.delete(context, getMendixObject());
	}
	/**
	 * @return value of ConfigurationName
	 */
	public final String getConfigurationName()
	{
		return getConfigurationName(getContext());
	}

	/**
	 * @param context
	 * @return value of ConfigurationName
	 */
	public final String getConfigurationName(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (String) getMendixObject().getValue(context, MemberNames.ConfigurationName.toString());
	}

	/**
	 * Set value of ConfigurationName
	 * @param configurationname
	 */
	public final void setConfigurationName(String configurationname)
	{
		setConfigurationName(getContext(), configurationname);
	}

	/**
	 * Set value of ConfigurationName
	 * @param context
	 * @param configurationname
	 */
	public final void setConfigurationName(com.mendix.systemwideinterfaces.core.IContext context, String configurationname)
	{
		getMendixObject().setValue(context, MemberNames.ConfigurationName.toString(), configurationname);
	}

	/**
	 * @return value of Hostname
	 */
	public final String getHostname()
	{
		return getHostname(getContext());
	}

	/**
	 * @param context
	 * @return value of Hostname
	 */
	public final String getHostname(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (String) getMendixObject().getValue(context, MemberNames.Hostname.toString());
	}

	/**
	 * Set value of Hostname
	 * @param hostname
	 */
	public final void setHostname(String hostname)
	{
		setHostname(getContext(), hostname);
	}

	/**
	 * Set value of Hostname
	 * @param context
	 * @param hostname
	 */
	public final void setHostname(com.mendix.systemwideinterfaces.core.IContext context, String hostname)
	{
		getMendixObject().setValue(context, MemberNames.Hostname.toString(), hostname);
	}

	/**
	 * @return value of Port
	 */
	public final Integer getPort()
	{
		return getPort(getContext());
	}

	/**
	 * @param context
	 * @return value of Port
	 */
	public final Integer getPort(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (Integer) getMendixObject().getValue(context, MemberNames.Port.toString());
	}

	/**
	 * Set value of Port
	 * @param port
	 */
	public final void setPort(Integer port)
	{
		setPort(getContext(), port);
	}

	/**
	 * Set value of Port
	 * @param context
	 * @param port
	 */
	public final void setPort(com.mendix.systemwideinterfaces.core.IContext context, Integer port)
	{
		getMendixObject().setValue(context, MemberNames.Port.toString(), port);
	}

	/**
	 * @return value of Username
	 */
	public final String getUsername()
	{
		return getUsername(getContext());
	}

	/**
	 * @param context
	 * @return value of Username
	 */
	public final String getUsername(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (String) getMendixObject().getValue(context, MemberNames.Username.toString());
	}

	/**
	 * Set value of Username
	 * @param username
	 */
	public final void setUsername(String username)
	{
		setUsername(getContext(), username);
	}

	/**
	 * Set value of Username
	 * @param context
	 * @param username
	 */
	public final void setUsername(com.mendix.systemwideinterfaces.core.IContext context, String username)
	{
		getMendixObject().setValue(context, MemberNames.Username.toString(), username);
	}

	/**
	 * @return value of Password
	 */
	public final String getPassword()
	{
		return getPassword(getContext());
	}

	/**
	 * @param context
	 * @return value of Password
	 */
	public final String getPassword(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (String) getMendixObject().getValue(context, MemberNames.Password.toString());
	}

	/**
	 * Set value of Password
	 * @param password
	 */
	public final void setPassword(String password)
	{
		setPassword(getContext(), password);
	}

	/**
	 * Set value of Password
	 * @param context
	 * @param password
	 */
	public final void setPassword(com.mendix.systemwideinterfaces.core.IContext context, String password)
	{
		getMendixObject().setValue(context, MemberNames.Password.toString(), password);
	}

	/**
	 * @return value of RemoteSourceFolder
	 */
	public final String getRemoteSourceFolder()
	{
		return getRemoteSourceFolder(getContext());
	}

	/**
	 * @param context
	 * @return value of RemoteSourceFolder
	 */
	public final String getRemoteSourceFolder(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (String) getMendixObject().getValue(context, MemberNames.RemoteSourceFolder.toString());
	}

	/**
	 * Set value of RemoteSourceFolder
	 * @param remotesourcefolder
	 */
	public final void setRemoteSourceFolder(String remotesourcefolder)
	{
		setRemoteSourceFolder(getContext(), remotesourcefolder);
	}

	/**
	 * Set value of RemoteSourceFolder
	 * @param context
	 * @param remotesourcefolder
	 */
	public final void setRemoteSourceFolder(com.mendix.systemwideinterfaces.core.IContext context, String remotesourcefolder)
	{
		getMendixObject().setValue(context, MemberNames.RemoteSourceFolder.toString(), remotesourcefolder);
	}

	/**
	 * @return value of RemoteDestinationFolder
	 */
	public final String getRemoteDestinationFolder()
	{
		return getRemoteDestinationFolder(getContext());
	}

	/**
	 * @param context
	 * @return value of RemoteDestinationFolder
	 */
	public final String getRemoteDestinationFolder(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (String) getMendixObject().getValue(context, MemberNames.RemoteDestinationFolder.toString());
	}

	/**
	 * Set value of RemoteDestinationFolder
	 * @param remotedestinationfolder
	 */
	public final void setRemoteDestinationFolder(String remotedestinationfolder)
	{
		setRemoteDestinationFolder(getContext(), remotedestinationfolder);
	}

	/**
	 * Set value of RemoteDestinationFolder
	 * @param context
	 * @param remotedestinationfolder
	 */
	public final void setRemoteDestinationFolder(com.mendix.systemwideinterfaces.core.IContext context, String remotedestinationfolder)
	{
		getMendixObject().setValue(context, MemberNames.RemoteDestinationFolder.toString(), remotedestinationfolder);
	}

	/**
	 * @return value of KeepRemoteFile
	 */
	public final Boolean getKeepRemoteFile()
	{
		return getKeepRemoteFile(getContext());
	}

	/**
	 * @param context
	 * @return value of KeepRemoteFile
	 */
	public final Boolean getKeepRemoteFile(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (Boolean) getMendixObject().getValue(context, MemberNames.KeepRemoteFile.toString());
	}

	/**
	 * Set value of KeepRemoteFile
	 * @param keepremotefile
	 */
	public final void setKeepRemoteFile(Boolean keepremotefile)
	{
		setKeepRemoteFile(getContext(), keepremotefile);
	}

	/**
	 * Set value of KeepRemoteFile
	 * @param context
	 * @param keepremotefile
	 */
	public final void setKeepRemoteFile(com.mendix.systemwideinterfaces.core.IContext context, Boolean keepremotefile)
	{
		getMendixObject().setValue(context, MemberNames.KeepRemoteFile.toString(), keepremotefile);
	}

	/**
	 * @return value of StrictHostkeyChecking
	 */
	public final Boolean getStrictHostkeyChecking()
	{
		return getStrictHostkeyChecking(getContext());
	}

	/**
	 * @param context
	 * @return value of StrictHostkeyChecking
	 */
	public final Boolean getStrictHostkeyChecking(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (Boolean) getMendixObject().getValue(context, MemberNames.StrictHostkeyChecking.toString());
	}

	/**
	 * Set value of StrictHostkeyChecking
	 * @param stricthostkeychecking
	 */
	public final void setStrictHostkeyChecking(Boolean stricthostkeychecking)
	{
		setStrictHostkeyChecking(getContext(), stricthostkeychecking);
	}

	/**
	 * Set value of StrictHostkeyChecking
	 * @param context
	 * @param stricthostkeychecking
	 */
	public final void setStrictHostkeyChecking(com.mendix.systemwideinterfaces.core.IContext context, Boolean stricthostkeychecking)
	{
		getMendixObject().setValue(context, MemberNames.StrictHostkeyChecking.toString(), stricthostkeychecking);
	}

	/**
	 * Set value of AuthenticationType
	 * @param authenticationtype
	 */
	public final sftpconnection.proxies.AuthenticationType getAuthenticationType()
	{
		return getAuthenticationType(getContext());
	}

	/**
	 * @param context
	 * @return value of AuthenticationType
	 */
	public final sftpconnection.proxies.AuthenticationType getAuthenticationType(com.mendix.systemwideinterfaces.core.IContext context)
	{
		Object obj = getMendixObject().getValue(context, MemberNames.AuthenticationType.toString());
		if (obj == null)
			return null;

		return sftpconnection.proxies.AuthenticationType.valueOf((java.lang.String) obj);
	}

	/**
	 * Set value of AuthenticationType
	 * @param authenticationtype
	 */
	public final void setAuthenticationType(sftpconnection.proxies.AuthenticationType authenticationtype)
	{
		setAuthenticationType(getContext(), authenticationtype);
	}

	/**
	 * Set value of AuthenticationType
	 * @param context
	 * @param authenticationtype
	 */
	public final void setAuthenticationType(com.mendix.systemwideinterfaces.core.IContext context, sftpconnection.proxies.AuthenticationType authenticationtype)
	{
		if (authenticationtype != null)
			getMendixObject().setValue(context, MemberNames.AuthenticationType.toString(), authenticationtype.toString());
		else
			getMendixObject().setValue(context, MemberNames.AuthenticationType.toString(), null);
	}

	/**
	 * @return value of SFTPConfiguration_PrivateKey_Connection
	 */
	public final sftpconnection.proxies.PrivateKeyConnection getSFTPConfiguration_PrivateKey_Connection() throws com.mendix.core.CoreException
	{
		return getSFTPConfiguration_PrivateKey_Connection(getContext());
	}

	/**
	 * @param context
	 * @return value of SFTPConfiguration_PrivateKey_Connection
	 */
	public final sftpconnection.proxies.PrivateKeyConnection getSFTPConfiguration_PrivateKey_Connection(com.mendix.systemwideinterfaces.core.IContext context) throws com.mendix.core.CoreException
	{
		sftpconnection.proxies.PrivateKeyConnection result = null;
		com.mendix.systemwideinterfaces.core.IMendixIdentifier identifier = getMendixObject().getValue(context, MemberNames.SFTPConfiguration_PrivateKey_Connection.toString());
		if (identifier != null)
			result = sftpconnection.proxies.PrivateKeyConnection.load(context, identifier);
		return result;
	}

	/**
	 * Set value of SFTPConfiguration_PrivateKey_Connection
	 * @param sftpconfiguration_privatekey_connection
	 */
	public final void setSFTPConfiguration_PrivateKey_Connection(sftpconnection.proxies.PrivateKeyConnection sftpconfiguration_privatekey_connection)
	{
		setSFTPConfiguration_PrivateKey_Connection(getContext(), sftpconfiguration_privatekey_connection);
	}

	/**
	 * Set value of SFTPConfiguration_PrivateKey_Connection
	 * @param context
	 * @param sftpconfiguration_privatekey_connection
	 */
	public final void setSFTPConfiguration_PrivateKey_Connection(com.mendix.systemwideinterfaces.core.IContext context, sftpconnection.proxies.PrivateKeyConnection sftpconfiguration_privatekey_connection)
	{
		if (sftpconfiguration_privatekey_connection == null)
			getMendixObject().setValue(context, MemberNames.SFTPConfiguration_PrivateKey_Connection.toString(), null);
		else
			getMendixObject().setValue(context, MemberNames.SFTPConfiguration_PrivateKey_Connection.toString(), sftpconfiguration_privatekey_connection.getMendixObject().getId());
	}

	/**
	 * @return value of SFTPConfiguration_KnownHosts
	 */
	public final sftpconnection.proxies.KnownHosts getSFTPConfiguration_KnownHosts() throws com.mendix.core.CoreException
	{
		return getSFTPConfiguration_KnownHosts(getContext());
	}

	/**
	 * @param context
	 * @return value of SFTPConfiguration_KnownHosts
	 */
	public final sftpconnection.proxies.KnownHosts getSFTPConfiguration_KnownHosts(com.mendix.systemwideinterfaces.core.IContext context) throws com.mendix.core.CoreException
	{
		sftpconnection.proxies.KnownHosts result = null;
		com.mendix.systemwideinterfaces.core.IMendixIdentifier identifier = getMendixObject().getValue(context, MemberNames.SFTPConfiguration_KnownHosts.toString());
		if (identifier != null)
			result = sftpconnection.proxies.KnownHosts.load(context, identifier);
		return result;
	}

	/**
	 * Set value of SFTPConfiguration_KnownHosts
	 * @param sftpconfiguration_knownhosts
	 */
	public final void setSFTPConfiguration_KnownHosts(sftpconnection.proxies.KnownHosts sftpconfiguration_knownhosts)
	{
		setSFTPConfiguration_KnownHosts(getContext(), sftpconfiguration_knownhosts);
	}

	/**
	 * Set value of SFTPConfiguration_KnownHosts
	 * @param context
	 * @param sftpconfiguration_knownhosts
	 */
	public final void setSFTPConfiguration_KnownHosts(com.mendix.systemwideinterfaces.core.IContext context, sftpconnection.proxies.KnownHosts sftpconfiguration_knownhosts)
	{
		if (sftpconfiguration_knownhosts == null)
			getMendixObject().setValue(context, MemberNames.SFTPConfiguration_KnownHosts.toString(), null);
		else
			getMendixObject().setValue(context, MemberNames.SFTPConfiguration_KnownHosts.toString(), sftpconfiguration_knownhosts.getMendixObject().getId());
	}

	/**
	 * @return the IMendixObject instance of this proxy for use in the Core interface.
	 */
	public final com.mendix.systemwideinterfaces.core.IMendixObject getMendixObject()
	{
		return sFTPConfigurationMendixObject;
	}

	/**
	 * @return the IContext instance of this proxy, or null if no IContext instance was specified at initialization.
	 */
	public final com.mendix.systemwideinterfaces.core.IContext getContext()
	{
		return context;
	}

	@Override
	public boolean equals(Object obj)
	{
		if (obj == this)
			return true;

		if (obj != null && getClass().equals(obj.getClass()))
		{
			final sftpconnection.proxies.SFTPConfiguration that = (sftpconnection.proxies.SFTPConfiguration) obj;
			return getMendixObject().equals(that.getMendixObject());
		}
		return false;
	}

	@Override
	public int hashCode()
	{
		return getMendixObject().hashCode();
	}

	/**
	 * @return String name of this class
	 */
	public static java.lang.String getType()
	{
		return "SFTPConnection.SFTPConfiguration";
	}

	/**
	 * @return String GUID from this object, format: ID_0000000000
	 * @deprecated Use getMendixObject().getId().toLong() to get a unique identifier for this object.
	 */
	@Deprecated
	public java.lang.String getGUID()
	{
		return "ID_" + getMendixObject().getId().toLong();
	}
}
