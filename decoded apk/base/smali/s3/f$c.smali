.class final Ls3/f$c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lh3/j;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Ls3/f;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1a
    name = "c"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lh3/j<",
        "Ljava/io/InputStream;",
        "Landroid/graphics/drawable/Drawable;",
        ">;"
    }
.end annotation


# instance fields
.field private final a:Ls3/f;


# direct methods
.method constructor <init>(Ls3/f;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ls3/f$c;->a:Ls3/f;

    return-void
.end method


# virtual methods
.method public bridge synthetic a(Ljava/lang/Object;Lh3/h;)Z
    .locals 0

    check-cast p1, Ljava/io/InputStream;

    invoke-virtual {p0, p1, p2}, Ls3/f$c;->d(Ljava/io/InputStream;Lh3/h;)Z

    move-result p1

    return p1
.end method

.method public bridge synthetic b(Ljava/lang/Object;IILh3/h;)Lj3/v;
    .locals 0

    check-cast p1, Ljava/io/InputStream;

    invoke-virtual {p0, p1, p2, p3, p4}, Ls3/f$c;->c(Ljava/io/InputStream;IILh3/h;)Lj3/v;

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
            "Landroid/graphics/drawable/Drawable;",
            ">;"
        }
    .end annotation

    invoke-static {p1}, Lc4/a;->b(Ljava/io/InputStream;)Ljava/nio/ByteBuffer;

    move-result-object p1

    invoke-static {p1}, Lq3/h;->a(Ljava/nio/ByteBuffer;)Landroid/graphics/ImageDecoder$Source;

    move-result-object p1

    iget-object v0, p0, Ls3/f$c;->a:Ls3/f;

    invoke-virtual {v0, p1, p2, p3, p4}, Ls3/f;->b(Landroid/graphics/ImageDecoder$Source;IILh3/h;)Lj3/v;

    move-result-object p1

    return-object p1
.end method

.method public d(Ljava/io/InputStream;Lh3/h;)Z
    .locals 0

    iget-object p2, p0, Ls3/f$c;->a:Ls3/f;

    invoke-virtual {p2, p1}, Ls3/f;->c(Ljava/io/InputStream;)Z

    move-result p1

    return p1
.end method