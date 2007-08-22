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
<title>Christ Church Bromley - Recordings help and additional information</title>
<STYLE type="text/css">

<!--

  li { font-size: 13px; font-family: Arial, Helvetica, sans-serif; font-weight: normal; text-decoration: none; }
  a, a:visited { font-size: 13px; font-family: Arial, Helvetica, sans-serif; font-weight: bold; text-decoration: none;  }  

  a:hover, a:active { text-decoration: underline; }
	
  .contentTableCell, .contentTableHeadingCell, .heading, .paragraph { font-family: Arial, Helvetica, sans-serif; }
	
  .contentTable { padding: 0px; margin: 0px; background-color: #FFFFFF; border-spacing: 10px; border-style: solid; border-color: #FFFFFF }

  .contentTableCell, .contentTableHeadingCell { font-size: 13px; padding: 10px; vertical-align: top }
  
  .contentTableHeadingCell { color: #014E9A; font-weight: bold; }
  
  .contentTableCell { color: #014E9A; }
	
  .heading { font-size: 17px; font-weight: bold } 
	
  .paragraph { font-size: 13px;  font-weight: normal }
	
  .highlightedLink { color: #9C2434 }
	
  img { border-style: none; border-width: 0px; }

// -->

</STYLE></head>
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
            <p class="heading">Help and additional information for accessing the recordings</p>
 	    <p class="paragraph">The help and additional information is available on following topics:</p> 
              <ul>
                <li><a href="#download">Download/streaming</a></li>
                <li><a href="#podcast">Podcast</a></li>
                <li><a href="#rss">RSS feeds</a></li>
              </ul>
            </p>
            <p class="paragraph">The sermon recordings 
              are produced and published by Christ Church Bromley's Digital Media 
              Service (DMS).</p>
            <p class="paragraph">If you have 
              comments about, problems with or improvement suggestions for this service, 
              please email <a href="mailto:dms@ccbromley.net">dms@ccbromley.net</a>.</p>
            <p class="heading"><a name="download"></a>Download/streaming</p>
	    <p class="paragraph">To download a recording, please click on the corresponding title link.
              If you are using the Microsoft Internet Explorer and the Windows Media Player, clicking the link will start the streaming and the immediate playback of the recording.
              In this case, you can download the sermon to a specific directory on your computer by right-clicking the title link and then selecting <code>Save Target As ...</code>.</p>
            <p class="paragraph">If you have iTunes installed on your computer as well as the Windows Media Player, MP3 files maybe associated with iTunes,
              in which case you will not be able to stream the sermon. To enable streaming through the Windows Media Player, start it and associate it with MP3 files in the <code>File Types</code> section of the options.
              To get to the options, please go to <code>Tools->Options ...</code> menu entry. Then try again.</p>
            <p class="heading"><a name="podcast"></a>Podcast</p>
            <p class="paragraph">A podcast is a technology that allows you to stay up-to-date with the latest Christ Church Bromley recordings.
              If you subscribe to a Chirst Church Bromley podcast on iTunes, the latest recordings are automatically downloaded to your computer over the internet, and, if you have one, to your iPod. The subscription and the iTunes software are absolutely free.
              For further information, please go to the <a href="http://www.apple.com/itunes/podcasts/">iTunes website</a> or read the <a href="http://en.wikipedia.org/wiki/Podcasting">Podcasting Wikipedia article</a>.</p>
            <p class="paragraph">To subscribe to a podcast:
              <ol>
                <li>Download the lastest iTunes version from the <a href="http://www.apple.com/itunes/download/">iTunes website</a>.</li>
                <li>Start iTunes and go to the podcast directory.</li>
                <li>Use the search field, enter "Christ Church Bromley" and then subscribe to the podcast of your choice. iTunes will start to download the lastest recordings automatically and synchronise with your iPod when you connect it.</li>
              </ol>
            </p>
            <p class="heading"><a name="rss"></a>RSS feeds</p>
            <p class="paragraph">A RSS feed is a technology allows you to get notified when new recordings become available. The difference to a podcast is that the recordings will not be automatically downloaded to your computer.
              If you subscribe to a Chirst Church Bromley RSS feed, your RSS reader software will automatically notify you whenever a new recording is published. The subscription and the required software are absolutely free.
              For more information about RSS feeds, please read the <a href="http://en.wikipedia.org/wiki/RSS_Feed">RSS Wikipedia article</a>.</p>
            <p class="paragraph">To subscribe to an RSS feed:
              <ol>
                <li>Download and install a free RSS reader (see <a href="http://en.wikipedia.org/wiki/List_of_news_aggregators">News Aggregators Wikipedia article</a>) or just use the built-in functionality of programs like Mozilla Firefox, Internet Explorer 7, Safari or Opera.</li>
                <li>Enter the RSS URL in your reader. You can get the RSS URL by clicking on the RSS logo <a href="sermon-recordings.xml"><img src="rss_feed.gif" alt="RSS feed"></img></a> of the corresponding recording page on the Christ Church Bromley web site. The URL for the sermon recordings RSS feed is <a href="sermon-recordings.xml">http://www.ccbromley.net/audio/sermon-recordings.xml</a></li>
              </ol>
            </p>
          </td>
        </tr>
      </table>
      <br>
      <hr width="718" align="center">
      <p align="center"><font size="1" color="#FFFFFF" face="arial">Entire contents 
        Copyright &copy; 
        <?php
			echo date("Y"); 
			?>
        Christ Church Bromley. All rights reserved.</font></p>
    </td>
  </tr>
</table>
<FONT SIZE=3 COLOR="BLACK"> 
<p>&nbsp;</p>
<p>&nbsp;</p>
</font> 
</body>
</html>
<?php
  $Recordset1->Close();
?>

