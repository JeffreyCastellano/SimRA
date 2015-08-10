/*
  Copyright 2015 IBM Corporation


Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License.

You may obtain a copy of the License at: http://www.apache.org/licenses/LICENSE-2.0

Unless required by applicable law or agreed to in writing, software distributed under 
the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF 
ANY KIND, either express or implied. 
See the License for the specific language governing permissions and limitations under the License.


*/


/**
 * This class contains information of each node at global level. Each node in the whole scaffold has its
 * own global ID. IDs of nodes in the scaffold are ordered globally based on the time they have been created during the simulation.
 * The class contains also some other informations such as the global IDs of son/s and parent/s of the given node.
 * 
 * @author Anna Paola Carrieri
 *
 */
public class GlobalNode {
	
	//global ID in the scaffold
	private int globalID;
	//age of the node
	private double time;
	//recomb is true if the node is a recombination node
	private boolean recomb;
	//vector containing the ids (local) of the parent/parents of the node
	private int[] parents;
	//vector containing the ids (local) of the son/sons of the node
	private int[] sons;
	//id of the local population of the node
	private int id_pop;
	//split point of the node (if it is a recombination node)
	private double splitPoint;
	
	/**
	 * This function returns the global id of the node in the whole scaffold
	 * @return the global id of the node
	 */
	public int getGlobalID() {
		return globalID;
	}
	/**
	 * This procedure sets the global id of the node. The global ID are ordered based on the age/time of the nodes (that is the order in which nodes are being created considering the whole scaffold)
	 * @param globalID integer representing the global id of the node in the whole graph
	 */
	public void setGlobalID(int globalID) {
		this.globalID = globalID;
	}
	/**
	 * This function returns the age of the node, that is the time in which the node has been created
	 * @return the age of the node
	 */
	public double getTime() {
		return time;
	}
	/**
	 * This procedure sets the age of the node, that is the time in which the node has been created
	 * set the age of the node 
	 * @param time real value representing the age of the node
	 */
	public void setTime(double time) {
		this.time = time;
	}
	/**
	 * This functions true if the node is a recombination node, false otherwise
	 * @return a boolean value true if the node is a recombination node, false otherwise
	 */
	public boolean isRecomb() {
		return recomb;
	}
	/**
	 * This procedures sets the value to true if the node is a recombination node
	 * @param recomb boolean value that is true if the node is a recombination node and false otherwise
	 */
	public void setRecomb(boolean recomb) {
		this.recomb = recomb;
	}
	/**
	 * This function returns a vector of integer of size at most two. Indeed each entry contains the ID of one parent of the node.
	 * Each node can have at most two parents.
	 * @return a vector containing the IDs of the parents of the node (local IDs)
	 */
	public int[] getParents() {
		return parents;
	}
	/**
	 * This procedure sets a vector of integer of size at most two. Each entry contains the ID of one parent of the node, where the ID is local to the ARG.
	 * Each node can have at most two parents.
	 * @param parents set the IDs of the parents of the node (local IDs)
	 */
	public void setParents(int[] parents) {
		this.parents = parents;
	}
	/**
	 * 
	 * This function returns a vector of integer of size at most two. Indeed each entry contains the ID of one son of the node, 
	 * where the ID is local respect to the population where it has been generated.
	 * Each node can have at most two sons. 
	 * 
	 * @return a vector containing the IDs of the node of the node (local IDs)
	 *
	 */
	public int[] getSons() {
		return sons;
	}
	
	/**
	 * 
	 * This procedure sets a vector of integer of size at most two. Indeed each entry contains the ID of one son of the node, 
	 * where the ID is local respect to the population where it has been generated.
	 * Each node can have at most two sons. 
	 * @param sons set the IDs of the sons of the node
	 */
	public void setSons(int[] sons) {
		this.sons = sons;
	}
	/**
	 * 
	 * This function returns the local ID of the population where the node has been created
	 * @return the id of the population of the node
	 */
	public int getId_pop() {
		return id_pop;
	}
	/**
	 * This procedure sets the ID of the population where the node has been created
	 * @param id_pop ID of the population
	 */
	public void setId_pop(int id_pop) {
		this.id_pop = id_pop;
	}
	
	/**
	 * This function returns the split point in the segment generated by a recombination event, if the node is a recombination node
	 * @return the split point in the segment carried by the node
	 */
	public double getSplitPoint() {
		return splitPoint;
	}
	/**
	 * This procedure sets the split point in the segment generated by a recombination event, if the node is a recombination node
	 * @param splitPoint the split point in the segment of the node if it is a recombination node
	 */
	public void setSplitPoint(double splitPoint) {
		this.splitPoint = splitPoint;
	}
}
