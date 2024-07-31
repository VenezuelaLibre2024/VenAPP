.class public final Lbe/b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lrd/b;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lrd/b<",
        "Lij/a<",
        "Ljava/lang/String;",
        ">;>;"
    }
.end annotation


# instance fields
.field private final a:Lbe/a;

.field private final b:Lbk/a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lbk/a<",
            "Lzd/c;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lbe/a;Lbk/a;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lbe/a;",
            "Lbk/a<",
            "Lzd/c;",
            ">;)V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lbe/b;->a:Lbe/a;

    iput-object p2, p0, Lbe/b;->b:Lbk/a;

    return-void
.end method

.method public static a(Lbe/a;Lbk/a;)Lbe/b;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lbe/a;",
            "Lbk/a<",
            "Lzd/c;",
            ">;)",
            "Lbe/b;"
        }
    .end annotation

    new-instance v0, Lbe/b;

    invoke-direct {v0, p0, p1}, Lbe/b;-><init>(Lbe/a;Lbk/a;)V

    return-object v0
.end method

.method public static c(Lbe/a;Lzd/c;)Lij/a;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lbe/a;",
            "Lzd/c;",
            ")",
            "Lij/a<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    invoke-virtual {p0, p1}, Lbe/a;->a(Lzd/c;)Lij/a;

    move-result-object p0

    invoke-static {p0}, Lrd/d;->e(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lij/a;

    return-object p0
.end method


# virtual methods
.method public b()Lij/a;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lij/a<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lbe/b;->a:Lbe/a;

    iget-object v1, p0, Lbe/b;->b:Lbk/a;

    invoke-interface {v1}, Lbk/a;->get()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lzd/c;

    invoke-static {v0, v1}, Lbe/b;->c(Lbe/a;Lzd/c;)Lij/a;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic get()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, Lbe/b;->b()Lij/a;

    move-result-object v0

    return-object v0
.end method
