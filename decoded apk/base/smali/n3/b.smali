.class public Ln3/b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ln3/o;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Ln3/b$d;,
        Ln3/b$a;,
        Ln3/b$c;,
        Ln3/b$b;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<Data:",
        "Ljava/lang/Object;",
        ">",
        "Ljava/lang/Object;",
        "Ln3/o<",
        "[BTData;>;"
    }
.end annotation


# instance fields
.field private final a:Ln3/b$b;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ln3/b$b<",
            "TData;>;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Ln3/b$b;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ln3/b$b<",
            "TData;>;)V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ln3/b;->a:Ln3/b$b;

    return-void
.end method


# virtual methods
.method public bridge synthetic a(Ljava/lang/Object;)Z
    .locals 0

    check-cast p1, [B

    invoke-virtual {p0, p1}, Ln3/b;->d([B)Z

    move-result p1

    return p1
.end method

.method public bridge synthetic b(Ljava/lang/Object;IILh3/h;)Ln3/o$a;
    .locals 0

    check-cast p1, [B

    invoke-virtual {p0, p1, p2, p3, p4}, Ln3/b;->c([BIILh3/h;)Ln3/o$a;

    move-result-object p1

    return-object p1
.end method

.method public c([BIILh3/h;)Ln3/o$a;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "([BII",
            "Lh3/h;",
            ")",
            "Ln3/o$a<",
            "TData;>;"
        }
    .end annotation

    new-instance p2, Ln3/o$a;

    new-instance p3, Lb4/d;

    invoke-direct {p3, p1}, Lb4/d;-><init>(Ljava/lang/Object;)V

    new-instance p4, Ln3/b$c;

    iget-object v0, p0, Ln3/b;->a:Ln3/b$b;

    invoke-direct {p4, p1, v0}, Ln3/b$c;-><init>([BLn3/b$b;)V

    invoke-direct {p2, p3, p4}, Ln3/o$a;-><init>(Lh3/f;Lcom/bumptech/glide/load/data/d;)V

    return-object p2
.end method

.method public d([B)Z
    .locals 0

    const/4 p1, 0x1

    return p1
.end method
