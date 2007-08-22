<?php


  //    Copyright (c) Interakt Online 2001
  //    http://www.interakt.ro/
	
  require("./../adodb/adodb.inc.php");
  require("./../Connections/ccb.php");
?><?php
   $Recordset1=$ccb->Execute("SELECT * FROM ccb001_ccb.mainmenu ORDER BY level ASC") or DIE($ccb->ErrorMsg());
   $Recordset1_numRows=0;
   $Recordset1__totalRows=$Recordset1->RecordCount();
?><?php
   $Repeat1__numRows = -1;
   $Repeat1__index= 0;
   $Recordset1_numRows = $Recordset1_numRows + $Repeat1__numRows;
?>
<html>
<head>
<title>Christ Church Bromley - Sermon recordings</title>
<link href="sermon-recordings.xml" rel="alternate" type="application/rss+xml" title="Christ Church Bromley - Sermon recordings" />
<STYLE type="text/css">

<!--

  li { font-size: 13px; font-family: Arial, Helvetica, sans-serif; font-weight: normal; text-decoration: none; }
  a, a:visited { font-size: 13px; font-family: Arial, Helvetica, sans-serif; font-weight: bold; text-decoration: none;  }  

  a:hover, a:active { text-decoration: underline; }
	
  .contentTableCell, .contentTableHeadingCell, .heading, .paragraph { font-family: Arial, Helvetica, sans-serif; }
	
  .contentTable { padding: 0px; margin: 0px; background-color: #FFFFFF; border-spacing: 5px; border-style: solid; border-color: #FFFFFF }

  .contentTableCell, .contentTableHeadingCell { font-size: 13px; padding: 3px; vertical-align: top }
  
  .contentTableHeadingCell { color: #014E9A; font-weight: bold; }
  
  .contentTableCell { color: #014E9A; }
	
  .heading { font-size: 17px; font-weight: bold } 
	
  .paragraph { font-size: 13px;  font-weight: normal }
	
  .highlightedLink { color: #9C2434 }
	
  img { border-style: none; border-width: 0px; }

// -->

</STYLE>
</head>
<BODY BGCOLOR="#014E9A" text="#FFFFFF" ALINK="#00FFFF" LINK="#00FFFF" VLINK="#00FFFF">
<table width="760" border="0" align="left">
  <tr> 
    <td bgcolor="014E9A" align="center"><a href="../index.php"><img src="../images/banner1.gif" width="748" height="115" alt="Christ Church Bromley" border="0"></a> 
    </td>
  </tr>
  <tr> 
    <td bgcolor="014E9A" height="10">&nbsp;</td>
  </tr>
  <tr> 
    <td bgcolor="014E9A"> 
      <table border="0">
        <tr> 
          <td width="10" valign="top" rowspan="2">&nbsp;</td>
          <td width="180" valign="top" rowspan="2"> 
            <table width="170" border="0" cellspacing="0" cellpadding="0">
              <tr> 
                <td><img src="../images/buttons/menu-end.gif" width="170" height="9"></td>
              </tr>
              <tr> 
                <td bgcolor="#9C2434" width="170"> 
                  <table width="165" border="0" cellpadding="0" cellspacing="0">
                    <?php while (($Repeat1__numRows-- != 0) && (!$Recordset1->EOF)) 
   { 
?>
                    <tr> 
                      <td bgcolor="#9C2434"><a href="<?php echo $Recordset1->Fields("target")?>"><img src="<?php echo $Recordset1->Fields("image")?>" border="0" alt="<?php echo $Recordset1->Fields("alt")?>"></a></td>
                    </tr>
                    <?php
  $Repeat1__index++;
  $Recordset1->MoveNext();
}
?>
                    <tr> 
                      <td><img src="../images/buttons/menu-end2.gif" width="170" height="11"></td>
                    </tr>
                  </table>
                </td>
              </tr>
            </table>
          </td>
        </tr>
        <tr> 
          <td valign="top" width="23">&nbsp;</td>
          <td valign="top" width="500"> 
            <p class="heading">Sermon recordings</p>
            <p class="paragraph">The following recordings 
            of recent sermons are available for download or streaming in MP3 format.</p>
            <p class="paragraph"><span style="text-decoration:blink;font-weight:bold">New!</span> The recordings are now also available as iTunes podcast (search for "Bromley") and <a href="sermon-recordings.xml"><img src="rss_feed.gif" alt="RSS feed"></img></a> RSS news feed.</p>
            <p class="paragraph">For help and additional information, <a href="help.php">click here</a>.</p>
           <table width="100%" class="contentTable" cellspacing="0">

