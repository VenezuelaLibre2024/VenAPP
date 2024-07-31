.class public final Lj5/a;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:Lj5/a;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lj5/a;

    invoke-direct {v0}, Lj5/a;-><init>()V

    sput-object v0, Lj5/a;->a:Lj5/a;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method private final a([B)I
    .locals 2

    new-instance v0, Landroidx/exifinterface/media/a;

    new-instance v1, Ljava/io/ByteArrayInputStream;

    invoke-direct {v1, p1}, Ljava/io/ByteArrayInputStream;-><init>([B)V

    invoke-direct {v0, v1}, Landroidx/exifinterface/media/a;-><init>(Ljava/io/InputStream;)V

    invoke-virtual {v0}, Landroidx/exifinterface/media/a;->r()I

    move-result p1

    return p1
.end method


# virtual methods
.method public final b([B)I
    .locals 1

    const-string v0, "_bytes"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/n;->e(Ljava/lang/Object;Ljava/lang/String;)V

    :try_start_0
    invoke-direct {p0, p1}, Lj5/a;->a([B)I

    move-result p1
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    const/4 p1, 0x0

    :goto_0
    return p1
.end method
