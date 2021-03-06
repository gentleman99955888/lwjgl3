/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.openvr;

import javax.annotation.*;

import java.nio.*;

import org.lwjgl.*;
import org.lwjgl.system.*;

import static org.lwjgl.system.MemoryUtil.*;
import static org.lwjgl.system.MemoryStack.*;

/**
 * <h3>Member documentation</h3>
 * 
 * <ul>
 * <li>{@code rVertexData} &ndash; Vertex data for the mesh</li>
 * <li>{@code unVertexCount} &ndash; Number of vertices in the vertex data</li>
 * <li>{@code IndexData} &ndash; Indices into the vertex data for each triangle</li>
 * <li>{@code unTriangleCount} &ndash; Number of triangles in the mesh. Index count is 3 * TriangleCount.</li>
 * <li>{@code diffuseTextureId} &ndash; Session unique texture identifier. Rendermodels which share the same texture will have the same id. 0 == texture not present.</li>
 * </ul>
 * 
 * <h3>Layout</h3>
 * 
 * <code><pre>
 * struct RenderModel_t {
 *     {@link RenderModelVertex RenderModel_Vertex_t const} * rVertexData;
 *     uint32_t unVertexCount;
 *     uint16_t const * IndexData;
 *     uint32_t unTriangleCount;
 *     TextureID_t diffuseTextureId;
 * }</pre></code>
 */
@NativeType("struct RenderModel_t")
public class RenderModel extends Struct implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        RVERTEXDATA,
        UNVERTEXCOUNT,
        INDEXDATA,
        UNTRIANGLECOUNT,
        DIFFUSETEXTUREID;

    static {
        Layout layout = __struct(
            __member(POINTER_SIZE),
            __member(4),
            __member(POINTER_SIZE),
            __member(4),
            __member(4)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        RVERTEXDATA = layout.offsetof(0);
        UNVERTEXCOUNT = layout.offsetof(1);
        INDEXDATA = layout.offsetof(2);
        UNTRIANGLECOUNT = layout.offsetof(3);
        DIFFUSETEXTUREID = layout.offsetof(4);
    }

    RenderModel(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    /**
     * Creates a {@link RenderModel} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public RenderModel(ByteBuffer container) {
        this(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** Returns a {@link RenderModelVertex.Buffer} view of the struct array pointed to by the {@code rVertexData} field. */
    @NativeType("RenderModel_Vertex_t const *")
    public RenderModelVertex.Buffer rVertexData() { return nrVertexData(address()); }
    /** Returns the value of the {@code unVertexCount} field. */
    @NativeType("uint32_t")
    public int unVertexCount() { return nunVertexCount(address()); }
    /** Returns a {@link ShortBuffer} view of the data pointed to by the {@code IndexData} field. */
    @NativeType("uint16_t const *")
    public ShortBuffer IndexData() { return nIndexData(address()); }
    /** Returns the value of the {@code unTriangleCount} field. */
    @NativeType("uint32_t")
    public int unTriangleCount() { return nunTriangleCount(address()); }
    /** Returns the value of the {@code diffuseTextureId} field. */
    @NativeType("TextureID_t")
    public int diffuseTextureId() { return ndiffuseTextureId(address()); }

    // -----------------------------------

    /** Returns a new {@link RenderModel} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static RenderModel malloc() {
        return create(nmemAllocChecked(SIZEOF));
    }

    /** Returns a new {@link RenderModel} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static RenderModel calloc() {
        return create(nmemCallocChecked(1, SIZEOF));
    }

    /** Returns a new {@link RenderModel} instance allocated with {@link BufferUtils}. */
    public static RenderModel create() {
        return new RenderModel(BufferUtils.createByteBuffer(SIZEOF));
    }

    /** Returns a new {@link RenderModel} instance for the specified memory address. */
    public static RenderModel create(long address) {
        return new RenderModel(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static RenderModel createSafe(long address) {
        return address == NULL ? null : create(address);
    }

    /**
     * Returns a new {@link RenderModel.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static RenderModel.Buffer malloc(int capacity) {
        return create(__malloc(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link RenderModel.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static RenderModel.Buffer calloc(int capacity) {
        return create(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link RenderModel.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static RenderModel.Buffer create(int capacity) {
        return new Buffer(__create(capacity, SIZEOF));
    }

    /**
     * Create a {@link RenderModel.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static RenderModel.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static RenderModel.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : create(address, capacity);
    }

    // -----------------------------------

    /** Returns a new {@link RenderModel} instance allocated on the thread-local {@link MemoryStack}. */
    public static RenderModel mallocStack() {
        return mallocStack(stackGet());
    }

    /** Returns a new {@link RenderModel} instance allocated on the thread-local {@link MemoryStack} and initializes all its bits to zero. */
    public static RenderModel callocStack() {
        return callocStack(stackGet());
    }

    /**
     * Returns a new {@link RenderModel} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static RenderModel mallocStack(MemoryStack stack) {
        return create(stack.nmalloc(ALIGNOF, SIZEOF));
    }

    /**
     * Returns a new {@link RenderModel} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static RenderModel callocStack(MemoryStack stack) {
        return create(stack.ncalloc(ALIGNOF, 1, SIZEOF));
    }

    /**
     * Returns a new {@link RenderModel.Buffer} instance allocated on the thread-local {@link MemoryStack}.
     *
     * @param capacity the buffer capacity
     */
    public static RenderModel.Buffer mallocStack(int capacity) {
        return mallocStack(capacity, stackGet());
    }

    /**
     * Returns a new {@link RenderModel.Buffer} instance allocated on the thread-local {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param capacity the buffer capacity
     */
    public static RenderModel.Buffer callocStack(int capacity) {
        return callocStack(capacity, stackGet());
    }

    /**
     * Returns a new {@link RenderModel.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static RenderModel.Buffer mallocStack(int capacity, MemoryStack stack) {
        return create(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link RenderModel.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static RenderModel.Buffer callocStack(int capacity, MemoryStack stack) {
        return create(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #rVertexData}. */
    public static RenderModelVertex.Buffer nrVertexData(long struct) { return RenderModelVertex.create(memGetAddress(struct + RenderModel.RVERTEXDATA), nunVertexCount(struct)); }
    /** Unsafe version of {@link #unVertexCount}. */
    public static int nunVertexCount(long struct) { return memGetInt(struct + RenderModel.UNVERTEXCOUNT); }
    /** Unsafe version of {@link #IndexData() IndexData}. */
    public static ShortBuffer nIndexData(long struct) { return memShortBuffer(memGetAddress(struct + RenderModel.INDEXDATA), (nunTriangleCount(struct) * 3)); }
    /** Unsafe version of {@link #unTriangleCount}. */
    public static int nunTriangleCount(long struct) { return memGetInt(struct + RenderModel.UNTRIANGLECOUNT); }
    /** Unsafe version of {@link #diffuseTextureId}. */
    public static int ndiffuseTextureId(long struct) { return memGetInt(struct + RenderModel.DIFFUSETEXTUREID); }

    // -----------------------------------

    /** An array of {@link RenderModel} structs. */
    public static class Buffer extends StructBuffer<RenderModel, Buffer> implements NativeResource {

        /**
         * Creates a new {@link RenderModel.Buffer} instance backed by the specified container.
         *
         * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link RenderModel#SIZEOF}, and its mark will be undefined.
         *
         * <p>The created buffer instance holds a strong reference to the container object.</p>
         */
        public Buffer(ByteBuffer container) {
            super(container, container.remaining() / SIZEOF);
        }

        public Buffer(long address, int cap) {
            super(address, null, -1, 0, cap, cap);
        }

        Buffer(long address, @Nullable ByteBuffer container, int mark, int pos, int lim, int cap) {
            super(address, container, mark, pos, lim, cap);
        }

        @Override
        protected Buffer self() {
            return this;
        }

        @Override
        protected Buffer newBufferInstance(long address, @Nullable ByteBuffer container, int mark, int pos, int lim, int cap) {
            return new Buffer(address, container, mark, pos, lim, cap);
        }

        @Override
        protected RenderModel newInstance(long address) {
            return new RenderModel(address, container);
        }

        @Override
        public int sizeof() {
            return SIZEOF;
        }

        /** Returns a {@link RenderModelVertex.Buffer} view of the struct array pointed to by the {@code rVertexData} field. */
        @NativeType("RenderModel_Vertex_t const *")
        public RenderModelVertex.Buffer rVertexData() { return RenderModel.nrVertexData(address()); }
        /** Returns the value of the {@code unVertexCount} field. */
        @NativeType("uint32_t")
        public int unVertexCount() { return RenderModel.nunVertexCount(address()); }
        /** Returns a {@link ShortBuffer} view of the data pointed to by the {@code IndexData} field. */
        @NativeType("uint16_t const *")
        public ShortBuffer IndexData() { return RenderModel.nIndexData(address()); }
        /** Returns the value of the {@code unTriangleCount} field. */
        @NativeType("uint32_t")
        public int unTriangleCount() { return RenderModel.nunTriangleCount(address()); }
        /** Returns the value of the {@code diffuseTextureId} field. */
        @NativeType("TextureID_t")
        public int diffuseTextureId() { return RenderModel.ndiffuseTextureId(address()); }

    }

}