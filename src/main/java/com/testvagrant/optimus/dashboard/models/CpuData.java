/*
 * Copyright (c) 2017.  TestVagrant Technologies
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 *
 */

package com.testvagrant.optimus.dashboard.models;


import java.util.Random;

public class CpuData {

    private String user = String.valueOf(new Random().nextInt(100));
    private String Kernel = String.valueOf(new Random().nextInt(100));

    public String getUser() {
        return user;
    }

    public CpuData setUser(String user) {
        this.user = user;
        return this;
    }

    public String getKernel() {
        return Kernel;
    }

    public CpuData setKernel(String kernel) {
        Kernel = kernel;
        return this;
    }

    @Override
    public String toString() {
        return "{"
                + "\"user\":\"" + user + "\""
                + ", \"Kernel\":\"" + Kernel + "\""
                + "}}";
    }
}
