# POOphonia: Music Library Management System

POOphonia is a Java-based application designed to manage a collection of music items. The system allows users to add, search, remove, and control playback of various types of music content such as songs, albums, and podcasts. It leverages object-oriented programming principles like encapsulation, inheritance, and polymorphism to provide a robust and extensible framework.

## Table of Contents
- [Overview](#overview)
- [Features](#features)
- [Project Structure](#project-structure)
- [Setup and Installation](#setup-and-installation)
- [Usage](#usage)
- [Command Interface](#command-interface)
- [Validation and Error Handling](#validation-and-error-handling)

## Overview

POOphonia enables users to manage a digital music library efficiently. Each music item (whether a song, album, or podcast) is represented as an object with specific attributes and behaviors. The application is built with a modular design that separates the data models, service logic, and user interface, ensuring clear organization and ease of maintenance.

## Features

- **Diverse Music Items**:  
  Manage different types of music items:
  - **Songs**: Includes details like title, artist, genre, release year, and duration.
  - **Albums**: Contains attributes such as title, artist, number of tracks, release year, and label.
  - **Podcasts**: Features host information, episode number, topic, and release year.

- **Dynamic Library Management**:  
  - **Add/Remove Items**: Seamlessly add or remove music items from the library.
  - **Search Functionality**: Locate items by unique ID or by title and artist.
  - **Playback Control**: Commands to play, pause, and stop items in the library.

- **CSV Integration**:  
  - Import and export the music library using CSV files.
  - Automatically update the library file after every change.

- **Command Processing**:  
  - Process a series of text-based commands to manipulate the library.
  - User-friendly messages provide clear feedback for each operation.

## Project Structure

The application is organized into the following packages and directories:

- **src/main/java**
  - **models**:  
    Contains the base class for music items (`MusicItem`) and its subclasses (`Song`, `Album`, `Podcast`). This package also includes a factory for creating music items from CSV data.
  
  - **services**:  
    - **MusicLibrary**: Manages the collection of music items using an `ArrayList`.  
    - **MusicLibraryFileHandler**: Handles CSV file operations for reading and saving the library.
  
  - **ui**:  
    Provides the user interface components including the command processor and messaging system.

- **data**:  
  Stores external resources such as the default CSV file for the music library and a sample command file.

- **Build Files**:  
  A provided makefile (or Maven configuration) supports easy compilation and execution of the project.

## Setup and Installation

1. **Prerequisites**:  
   - Java Development Kit (JDK)  
   - An IDE or text editor suitable for Java development  

2. **Directory Layout**:  
   Ensure the following structure exists:
   - `src/main/java` for source code  
   - `data` for CSV and command files

3. **Compilation**:  
   - Use the provided makefile by running `make help` to see available build and run options.  
   - Alternatively, compile and run the project using your preferred IDE.

## Usage

After compiling the application, you can launch POOphonia to load the music library and start processing commands. The application supports a variety of commands to manipulate the music library and control playback.

## Command Interface

POOphonia processes commands provided via a text file or direct input. Key commands include:

- **ADD**:  
  Adds a new music item. For example: