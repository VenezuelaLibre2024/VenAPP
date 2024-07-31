.class public final Lud/f;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lbk/a;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lbk/a;"
    }
.end annotation


# instance fields
.field private final a:Lbk/a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lbk/a<",
            "Lcom/bumptech/glide/k;",
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
            "Lcom/bumptech/glide/k;",
            ">;)V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lud/f;->a:Lbk/a;

    return-void
.end method

.method public static a(Lbk/a;)Lud/f;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lbk/a<",
            "Lcom/bumptech/glide/k;",
            ">;)",
            "Lud/f;"
        }
    .end annotation

    new-instance v0, Lud/f;

    invoke-direct {v0, p0}, Lud/f;-><init>(Lbk/a;)V

    return-object v0
.end method

.method public static c(Lcom/bumptech/glide/k;)Lud/e;
    .locals 1

    new-instance v0, Lud/e;

    invoke-direct {v0, p0}, Lud/e;-><init>(Lcom/bumptech/glide/k;)V

    return-object v0
.end method


# virtual methods
.method public b()Lud/e;
    .locals 1

    iget-object v0, p0, Lud/f;->a:Lbk/a;

    invoke-interface {v0}, Lbk/a;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/bumptech/glide/k;

    invoke-static {v0}, Lud/f;->c(Lcom/bumptech/glide/k;)Lud/e;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic get()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, Lud/f;->b()Lud/e;

    move-result-object v0

    return-object v0
.end method
