.class public final Lq3/w;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lh3/j;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lh3/j<",
        "Ljava/io/InputStream;",
        "Landroid/graphics/Bitmap;",
        ">;"
    }
.end annotation


# instance fields
.field private final a:Lq3/e;


# direct methods
.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Lq3/e;

    invoke-direct {v0}, Lq3/e;-><init>()V

    iput-object v0, p0, Lq3/w;->a:Lq3/e;

    return-void
.end method


# virtual methods
.method public bridge synthetic a(Ljava/lang/Object;Lh3/h;)Z
    .locals 0

    check-cast p1, Ljava/io/InputStream;

    invoke-virtual {p0, p1, p2}, Lq3/w;->d(Ljava/io/InputStream;Lh3/h;)Z

    move-result p1

    return p1
.end method

.method public bridge synthetic b(Ljava/lang/Object;IILh3/h;)Lj3/v;
    .locals 0

    check-cast p1, Ljava/io/InputStream;

    invoke-virtual {p0, p1, p2, p3, p4}, Lq3/w;->c(Ljava/io/InputStream;IILh3/h;)Lj3/v;

    move-result-object p1

    return-object p1
.end method

.method public c(Ljava/io/InputStream;IILh3/h;)Lj3/v;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/io/InputStream;",
            "II",
            "Lh3/h;",
            ")",
            "Lj3/v<",
            "Landroid/graphics/Bitmap;",
            ">;"
        }
    .end annotation

    invoke-static {p1}, Lc4/a;->b(Ljava/io/InputStream;)Ljava/nio/ByteBuffer;

    move-result-object p1

    invoke-static {p1}, Lq3/h;->a(Ljava/nio/ByteBuffer;)Landroid/graphics/ImageDecoder$Source;

    move-result-object p1

    iget-object v0, p0, Lq3/w;->a:Lq3/e;

    invoke-virtual {v0, p1, p2, p3, p4}, Lq3/e;->c(Landroid/graphics/ImageDecoder$Source;IILh3/h;)Lj3/v;

    move-result-object p1

    return-object p1
.end method

.method public d(Ljava/io/InputStream;Lh3/h;)Z
    .locals 0

    const/4 p1, 0x1

    return p1
.end method
