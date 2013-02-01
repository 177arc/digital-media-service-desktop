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
	xmlns:org.onceforall.dms.desktop.logic="http://www.onceforall.org/dms/desktop/model.ecore"
	xmlns:ecore="http://www.eclipse.org/emf/2002/Ecore">
	<xsl:output indent="yes" method="xml" encoding="UTF-8"/>
	<xsl:template match="/">
<migratedMp3s>
<xsl:for-each select="//mMp3s[position() &lt;= 2]">
	<xsl:apply-templates select="."/>
</xsl:for-each>
</migratedMp3s>		
	</xsl:template>
	<xsl:template match="mMp3s">
		<mMp3s id="#{generate-id(.)}">
		<xsl:for-each select="child::*">
			<xsl:value-of select="@readOnly"/>
		</xsl:for-each>
		</mMp3s>
	</xsl:template>
</xsl:stylesheet>