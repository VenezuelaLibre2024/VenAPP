.class public final Lt8/m;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lt8/m$b;,
        Lt8/m$a;
    }
.end annotation


# instance fields
.field private final a:I

.field private final b:[Lt8/m$a;

.field private final c:[Lt8/m$b;

.field private final d:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Lt8/m$a;",
            ">;"
        }
    .end annotation
.end field

.field private final e:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Lt8/m$b;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Ljava/lang/String;Ljava/lang/String;)V
    .locals 5

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    invoke-static {}, Landroid/opengl/GLES20;->glCreateProgram()I

    move-result v0

    iput v0, p0, Lt8/m;->a:I

    invoke-static {}, Lt8/n;->b()V

    const v1, 0x8b31

    invoke-static {v0, v1, p1}, Lt8/m;->d(IILjava/lang/String;)V

    const p1, 0x8b30

    invoke-static {v0, p1, p2}, Lt8/m;->d(IILjava/lang/String;)V

    invoke-static {v0}, Landroid/opengl/GLES20;->glLinkProgram(I)V

    const/4 p1, 0x1

    new-array p2, p1, [I

    const/4 v1, 0x0

    aput v1, p2, v1

    const v2, 0x8b82

    invoke-static {v0, v2, p2, v1}, Landroid/opengl/GLES20;->glGetProgramiv(II[II)V

    aget p2, p2, v1

    if-ne p2, p1, :cond_0

    move p2, p1

    goto :goto_0

    :cond_0
    move p2, v1

    :goto_0
    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "Unable to link shader program: \n"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-static {v0}, Landroid/opengl/GLES20;->glGetProgramInfoLog(I)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-static {p2, v2}, Lt8/n;->c(ZLjava/lang/String;)V

    invoke-static {v0}, Landroid/opengl/GLES20;->glUseProgram(I)V

    new-instance p2, Ljava/util/HashMap;

    invoke-direct {p2}, Ljava/util/HashMap;-><init>()V

    iput-object p2, p0, Lt8/m;->d:Ljava/util/Map;

    new-array p2, p1, [I

    const v2, 0x8b89

    invoke-static {v0, v2, p2, v1}, Landroid/opengl/GLES20;->glGetProgramiv(II[II)V

    aget v0, p2, v1

    new-array v0, v0, [Lt8/m$a;

    iput-object v0, p0, Lt8/m;->b:[Lt8/m$a;

    move v0, v1

    :goto_1
    aget v2, p2, v1

    if-ge v0, v2, :cond_1

    iget v2, p0, Lt8/m;->a:I

    invoke-static {v2, v0}, Lt8/m$a;->a(II)Lt8/m$a;

    move-result-object v2

    iget-object v3, p0, Lt8/m;->b:[Lt8/m$a;

    aput-object v2, v3, v0

    iget-object v3, p0, Lt8/m;->d:Ljava/util/Map;

    iget-object v4, v2, Lt8/m$a;->a:Ljava/lang/String;

    invoke-interface {v3, v4, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    add-int/lit8 v0, v0, 0x1

    goto :goto_1

    :cond_1
    new-instance p2, Ljava/util/HashMap;

    invoke-direct {p2}, Ljava/util/HashMap;-><init>()V

    iput-object p2, p0, Lt8/m;->e:Ljava/util/Map;

    new-array p1, p1, [I

    iget p2, p0, Lt8/m;->a:I

    const v0, 0x8b86

    invoke-static {p2, v0, p1, v1}, Landroid/opengl/GLES20;->glGetProgramiv(II[II)V

    aget p2, p1, v1

    new-array p2, p2, [Lt8/m$b;

    iput-object p2, p0, Lt8/m;->c:[Lt8/m$b;

    move p2, v1

    :goto_2
    aget v0, p1, v1

    if-ge p2, v0, :cond_2

    iget v0, p0, Lt8/m;->a:I

    invoke-static {v0, p2}, Lt8/m$b;->a(II)Lt8/m$b;

    move-result-object v0

    iget-object v2, p0, Lt8/m;->c:[Lt8/m$b;

    aput-object v0, v2, p2

    iget-object v2, p0, Lt8/m;->e:Ljava/util/Map;

    iget-object v3, v0, Lt8/m$b;->a:Ljava/lang/String;

    invoke-interface {v2, v3, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    add-int/lit8 p2, p2, 0x1

    goto :goto_2

    :cond_2
    invoke-static {}, Lt8/n;->b()V

    return-void
.end method

.method static synthetic a([B)I
    .locals 0

    invoke-static {p0}, Lt8/m;->h([B)I

    move-result p0

    return p0
.end method

.method static synthetic b(ILjava/lang/String;)I
    .locals 0

    invoke-static {p0, p1}, Lt8/m;->f(ILjava/lang/String;)I

    move-result p0

    return p0
.end method

.method static synthetic c(ILjava/lang/String;)I
    .locals 0

    invoke-static {p0, p1}, Lt8/m;->i(ILjava/lang/String;)I

    move-result p0

    return p0
.end method

.method private static d(IILjava/lang/String;)V
    .locals 4

    invoke-static {p1}, Landroid/opengl/GLES20;->glCreateShader(I)I

    move-result p1

    invoke-static {p1, p2}, Landroid/opengl/GLES20;->glShaderSource(ILjava/lang/String;)V

    invoke-static {p1}, Landroid/opengl/GLES20;->glCompileShader(I)V

    const/4 v0, 0x1

    new-array v1, v0, [I

    const/4 v2, 0x0

    aput v2, v1, v2

    const v3, 0x8b81

    invoke-static {p1, v3, v1, v2}, Landroid/opengl/GLES20;->glGetShaderiv(II[II)V

    aget v1, v1, v2

    if-ne v1, v0, :cond_0

    goto :goto_0

    :cond_0
    move v0, v2

    :goto_0
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-static {p1}, Landroid/opengl/GLES20;->glGetShaderInfoLog(I)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v2, ", source: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-static {v0, p2}, Lt8/n;->c(ZLjava/lang/String;)V

    invoke-static {p0, p1}, Landroid/opengl/GLES20;->glAttachShader(II)V

    invoke-static {p1}, Landroid/opengl/GLES20;->glDeleteShader(I)V

    invoke-static {}, Lt8/n;->b()V

    return-void
.end method

.method private static f(ILjava/lang/String;)I
    .locals 0

    invoke-static {p0, p1}, Landroid/opengl/GLES20;->glGetAttribLocation(ILjava/lang/String;)I

    move-result p0

    return p0
.end method

.method private g(Ljava/lang/String;)I
    .locals 1

    iget v0, p0, Lt8/m;->a:I

    invoke-static {v0, p1}, Lt8/m;->f(ILjava/lang/String;)I

    move-result p1

    return p1
.end method

.method private static h([B)I
    .locals 2

    const/4 v0, 0x0

    :goto_0
    array-length v1, p0

    if-ge v0, v1, :cond_1

    aget-byte v1, p0, v0

    if-nez v1, :cond_0

    return v0

    :cond_0
    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_1
    array-length p0, p0

    return p0
.end method

.method private static i(ILjava/lang/String;)I
    .locals 0

    invoke-static {p0, p1}, Landroid/opengl/GLES20;->glGetUniformLocation(ILjava/lang/String;)I

    move-result p0

    return p0
.end method


# virtual methods
.method public e(Ljava/lang/String;)I
    .locals 0

    invoke-direct {p0, p1}, Lt8/m;->g(Ljava/lang/String;)I

    move-result p1

    invoke-static {p1}, Landroid/opengl/GLES20;->glEnableVertexAttribArray(I)V

    invoke-static {}, Lt8/n;->b()V

    return p1
.end method

.method public j(Ljava/lang/String;)I
    .locals 1

    iget v0, p0, Lt8/m;->a:I

    invoke-static {v0, p1}, Lt8/m;->i(ILjava/lang/String;)I

    move-result p1

    return p1
.end method
