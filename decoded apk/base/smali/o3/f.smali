.class public Lo3/f;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ln3/o;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lo3/f$a;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Ln3/o<",
        "Ljava/net/URL;",
        "Ljava/io/InputStream;",
        ">;"
    }
.end annotation


# instance fields
.field private final a:Ln3/o;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ln3/o<",
            "Ln3/h;",
            "Ljava/io/InputStream;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Ln3/o;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ln3/o<",
            "Ln3/h;",
            "Ljava/io/InputStream;",
            ">;)V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lo3/f;->a:Ln3/o;

    return-void
.end method


# virtual methods
.method public bridge synthetic a(Ljava/lang/Object;)Z
    .locals 0

    check-cast p1, Ljava/net/URL;

    invoke-virtual {p0, p1}, Lo3/f;->d(Ljava/net/URL;)Z

    move-result p1

    return p1
.end method

.method public bridge synthetic b(Ljava/lang/Object;IILh3/h;)Ln3/o$a;
    .locals 0

    check-cast p1, Ljava/net/URL;

    invoke-virtual {p0, p1, p2, p3, p4}, Lo3/f;->c(Ljava/net/URL;IILh3/h;)Ln3/o$a;

    move-result-object p1

    return-object p1
.end method

.method public c(Ljava/net/URL;IILh3/h;)Ln3/o$a;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/net/URL;",
            "II",
            "Lh3/h;",
            ")",
            "Ln3/o$a<",
            "Ljava/io/InputStream;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lo3/f;->a:Ln3/o;

    new-instance v1, Ln3/h;

    invoke-direct {v1, p1}, Ln3/h;-><init>(Ljava/net/URL;)V

    invoke-interface {v0, v1, p2, p3, p4}, Ln3/o;->b(Ljava/lang/Object;IILh3/h;)Ln3/o$a;

    move-result-object p1

    return-object p1
.end method

.method public d(Ljava/net/URL;)Z
    .locals 0

    const/4 p1, 0x1

    return p1
.end method
