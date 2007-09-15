<?xml version="1.0" encoding="UTF-8"?>
<!--
Migrates all MP3 entries from the old application data format to the new format. Sections of the resulting
XML file have to manually copied and pasted to a new application data file.

Revision History:
$Log: MP3\040entry\040migration.xslt,v $
Revision 1.1  2006/08/29 00:42:20  marc
Added initial revision.

Revision 1.2  2006/08/28 15:06:24  marc
Updated to save changes.

Revision 1.1  2006/08/28 04:22:36  marc
Added initial revision.
 
-->
<xsl:stylesheet version="1.0"
	xmlns:xsl="http://www.w3.org/1999/XSL/Transform"
	xmlns:xmi="http://www.omg.org/XMI"
	xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
	xmlns:ecore="http://www.eclipse.org/emf/2002/Ecore">
	<xsl:output indent="yes" method="xml" encoding="UTF-8"/>
	<xsl:template match="/object[@class='Application']/objects">
<migratedMp3s>
		<xsl:for-each select="object[@class='PublishedMP3s']">		
	<migratedMp3Folder name="{@name}">
			<xsl:for-each select="objects/object[@class='PublishedMP3']">
	  <mMp3s> 
	  		<xsl:attribute name="name"><xsl:value-of select="@name"/></xsl:attribute>
	  		<xsl:attribute name="description">Contains all information associated with an MP3 file that can be published.</xsl:attribute>
	  		<xsl:attribute name="stateProperty"><xsl:value-of select="values/property[@name='Status']/@value"/></xsl:attribute>
	  		<xsl:attribute name="fileProperty"><xsl:value-of select="values/property[@name='File']/@value"/></xsl:attribute>
	  		<xsl:attribute name="linkTextProperty"><xsl:value-of select="values/property[@name='Link text']/@value"/></xsl:attribute>
	  		<xsl:attribute name="linkDescriptionProperty"><xsl:value-of select="values/property[@name='Link description']/@value" /></xsl:attribute>
	  		<xsl:attribute name="commentProperty"><xsl:value-of select="values/property[@name='Comment']/@value" /></xsl:attribute>
	  		<xsl:attribute name="podcastTitleProperty"><xsl:value-of select="values/property[@name='Podcast title']/@value" /></xsl:attribute>
	  		<xsl:attribute name="podcastSubtitleProperty"><xsl:value-of select="values/property[@name='Podcast subtitle']/@value" /></xsl:attribute>
	  		<xsl:variable name="podcastPublishingDate" select="values/property[@name='Podcast publication date']/@value"/>
	  		<xsl:if test="$podcastPublishingDate!='(Empty)'">
	   			<xsl:variable name="podcastPublishingMonth" select="substring($podcastPublishingDate, 4, 3)"/> 		 
	  			<xsl:attribute name="podcastPublishingDateProperty"><xsl:value-of select="substring($podcastPublishingDate, 8, 4)"/>-<xsl:choose>
							<xsl:when test="$podcastPublishingMonth='Jan'">01</xsl:when>
							<xsl:when test="$podcastPublishingMonth='Feb'">02</xsl:when>
							<xsl:when test="$podcastPublishingMonth='Mar'">03</xsl:when>
							<xsl:when test="$podcastPublishingMonth='Apr'">04</xsl:when>
							<xsl:when test="$podcastPublishingMonth='May'">05</xsl:when>
							<xsl:when test="$podcastPublishingMonth='Jun'">06</xsl:when>
							<xsl:when test="$podcastPublishingMonth='Jul'">07</xsl:when>
							<xsl:when test="$podcastPublishingMonth='Aug'">08</xsl:when>
							<xsl:when test="$podcastPublishingMonth='Sep'">09</xsl:when>
							<xsl:when test="$podcastPublishingMonth='Oct'">10</xsl:when>
							<xsl:when test="$podcastPublishingMonth='Nov'">11</xsl:when>
							<xsl:when test="$podcastPublishingMonth='Dec'">12</xsl:when>
						</xsl:choose>-<xsl:value-of select="substring($podcastPublishingDate, 1, 2)"/>T<xsl:value-of select="substring($podcastPublishingDate, 13, 8)"/>.000+0800</xsl:attribute>		
	  		</xsl:if>
	  		<xsl:attribute name="publishedFileNameProperty"><xsl:value-of select="values/property[@name='Published file name']/@value" /></xsl:attribute>
	      <mNameProperty name="Name" description="Specifies the name."/>
	      <mDescriptionProperty name="Description" description="Specifies a detailed description."/>
	      <mIconFilePathProperty name="Icon file path" description="Specifies the file path to the icon that represents this element."/>
	      <mStateProperty name="State" description="Specifies the current state." readOnly="true"/>
	      <mLastStateChangeProperty name="Last state change" description="Specifies the date and time of the last state change." readOnly="true"/>
	      <mFileProperty name="File" description="Specifies the MP3 recording file on this computer."/>
	      <mLinkTextProperty name="Link text" description="Specifies the link text for the published MP3 file."/>
	      <mLinkDescriptionProperty name="Link description" description="Specifies the link description for the published MP3 file. The description will be displayed underneath the link."/>
	      <mCommentProperty name="Comment" description="Specifies a comment for the published MP3 file. This can be for example problems with the recording."/>
	      <mPodcastTitleProperty name="Podcast title" description="Specifies the podcast title. The title appears as in the Name column in iTunes. If the title is omitted the MP3 will not be included in the podcast."/>
	      <mPodcastSubtitleProperty name="Podcast subtitle" description="Specifies the podcast subtitle. The subtitle appears as in the Description column in iTunes."/>
	      <mPodcastSummaryProperty name="Podcast summary" description="Specifies the podcast summary. The summary appears  when the circled (i) in the Description column is clicked."/>
	      <mPodcastPublishingDateProperty name="Podcast publishing date" description="Specifies the publishing date of the MP3 file. The publishing date appears in the Release Date column in iTunes."/>
	      <mPublishedFileNameProperty name="Published file name" description="Specifies the name of published file on the FTP server."/>
		</mMp3s>			
			</xsl:for-each>
	</migratedMp3Folder>
		</xsl:for-each>
</migratedMp3s>		
	</xsl:template>
</xsl:stylesheet>