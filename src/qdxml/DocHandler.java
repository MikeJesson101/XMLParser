// This file is part of MAJ's XML parser 
// Copyright (C) 2009 - 2016 Michael Jesson
// 
// MAJ's XML parser is free software; you can redistribute it and/or
// modify it under the terms of the GNU General Public License
// as published by the Free Software Foundation; either version 3
// of the License, or (at your option) any later version.
// 
// MAJ's XML parser is distributed in the hope that it will be useful,
// but WITHOUT ANY WARRANTY; without even the implied warranty of
// MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
// GNU General Public License for more details.
// 
// You should have received a copy of the GNU General Public License
// along with MAJ's XML parser.  If not, see <http://www.gnu.org/licenses/>.

package qdxml;

import java.util.*;

public interface DocHandler {
  public void startElement(String tag,Hashtable<String, String> h) throws Exception;
  public void endElement(String tag) throws Exception;
  public void startDocument() throws Exception;
  public void endDocument() throws Exception;
  public void text(String str) throws Exception;
}
