.class public final Lx5/f;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:Lx5/f;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lx5/f;

    invoke-direct {v0}, Lx5/f;-><init>()V

    sput-object v0, Lx5/f;->a:Lx5/f;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(I)I
    .locals 2

    const/4 v0, 0x1

    if-eq p1, v0, :cond_1

    const/4 v0, 0x3

    const/4 v1, 0x2

    if-eq p1, v1, :cond_1

    if-eq p1, v0, :cond_0

    const/4 v0, 0x0

    goto :goto_0

    :cond_0
    move v0, v1

    :cond_1
    :goto_0
    return v0
.end method

.method public final b(I)Landroid/net/Uri;
    .locals 2

    const/4 v0, 0x1

    const-string v1, "EXTERNAL_CONTENT_URI"

    if-eq p1, v0, :cond_2

    const/4 v0, 0x2

    if-eq p1, v0, :cond_1

    const/4 v0, 0x3

    if-eq p1, v0, :cond_0

    sget-object p1, Lx5/e;->a:Lx5/e$a;

    invoke-virtual {p1}, Lx5/e$a;->a()Landroid/net/Uri;

    move-result-object p1

    goto :goto_1

    :cond_0
    sget-object p1, Landroid/provider/MediaStore$Video$Media;->EXTERNAL_CONTENT_URI:Landroid/net/Uri;

    goto :goto_0

    :cond_1
    sget-object p1, Landroid/provider/MediaStore$Audio$Media;->EXTERNAL_CONTENT_URI:Landroid/net/Uri;

    goto :goto_0

    :cond_2
    sget-object p1, Landroid/provider/MediaStore$Images$Media;->EXTERNAL_CONTENT_URI:Landroid/net/Uri;

    :goto_0
    invoke-static {p1, v1}, Lkotlin/jvm/internal/n;->d(Ljava/lang/Object;Ljava/lang/String;)V

    :goto_1
    return-object p1
.end method

.method public final c(JI)Landroid/net/Uri;
    .locals 0

    invoke-virtual {p0, p3}, Lx5/f;->b(I)Landroid/net/Uri;

    move-result-object p3

    invoke-static {p3, p1, p2}, Landroid/content/ContentUris;->withAppendedId(Landroid/net/Uri;J)Landroid/net/Uri;

    move-result-object p1

    const-string p2, "withAppendedId(...)"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/n;->d(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p1
.end method
