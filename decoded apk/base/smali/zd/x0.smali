.class public final Lzd/x0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lrd/b;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lrd/b<",
        "Lzd/w0;",
        ">;"
    }
.end annotation


# instance fields
.field private final a:Lbk/a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lbk/a<",
            "Lzd/u2;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lbk/a;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lbk/a<",
            "Lzd/u2;",
            ">;)V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lzd/x0;->a:Lbk/a;

    return-void
.end method

.method public static a(Lbk/a;)Lzd/x0;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lbk/a<",
            "Lzd/u2;",
            ">;)",
            "Lzd/x0;"
        }
    .end annotation

    new-instance v0, Lzd/x0;

    invoke-direct {v0, p0}, Lzd/x0;-><init>(Lbk/a;)V

    return-object v0
.end method

.method public static c(Lzd/u2;)Lzd/w0;
    .locals 1

    new-instance v0, Lzd/w0;

    invoke-direct {v0, p0}, Lzd/w0;-><init>(Lzd/u2;)V

    return-object v0
.end method


# virtual methods
.method public b()Lzd/w0;
    .locals 1

    iget-object v0, p0, Lzd/x0;->a:Lbk/a;

    invoke-interface {v0}, Lbk/a;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lzd/u2;

    invoke-static {v0}, Lzd/x0;->c(Lzd/u2;)Lzd/w0;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic get()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, Lzd/x0;->b()Lzd/w0;

    move-result-object v0

    return-object v0
.end method
