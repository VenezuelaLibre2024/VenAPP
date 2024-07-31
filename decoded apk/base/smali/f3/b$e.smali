.class public final Lf3/b$e;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lf3/b;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x11
    name = "e"
.end annotation


# instance fields
.field private final a:Ljava/lang/String;

.field private final b:J

.field private final c:[J

.field private final d:[Ljava/io/File;

.field final synthetic e:Lf3/b;


# direct methods
.method private constructor <init>(Lf3/b;Ljava/lang/String;J[Ljava/io/File;[J)V
    .locals 0

    iput-object p1, p0, Lf3/b$e;->e:Lf3/b;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p2, p0, Lf3/b$e;->a:Ljava/lang/String;

    iput-wide p3, p0, Lf3/b$e;->b:J

    iput-object p5, p0, Lf3/b$e;->d:[Ljava/io/File;

    iput-object p6, p0, Lf3/b$e;->c:[J

    return-void
.end method

.method synthetic constructor <init>(Lf3/b;Ljava/lang/String;J[Ljava/io/File;[JLf3/b$a;)V
    .locals 0

    invoke-direct/range {p0 .. p6}, Lf3/b$e;-><init>(Lf3/b;Ljava/lang/String;J[Ljava/io/File;[J)V

    return-void
.end method


# virtual methods
.method public a(I)Ljava/io/File;
    .locals 1

    iget-object v0, p0, Lf3/b$e;->d:[Ljava/io/File;

    aget-object p1, v0, p1

    return-object p1
.end method
