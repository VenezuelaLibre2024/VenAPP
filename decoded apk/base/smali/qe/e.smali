.class public final Lqe/e;
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
.field private final a:Lqe/a;


# direct methods
.method public constructor <init>(Lqe/a;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lqe/e;->a:Lqe/a;

    return-void
.end method

.method public static a(Lqe/a;)Lqe/e;
    .locals 1

    new-instance v0, Lqe/e;

    invoke-direct {v0, p0}, Lqe/e;-><init>(Lqe/a;)V

    return-object v0
.end method

.method public static c(Lqe/a;)Lee/b;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lqe/a;",
            ")",
            "Lee/b<",
            "Lcom/google/firebase/remoteconfig/c;",
            ">;"
        }
    .end annotation

    invoke-virtual {p0}, Lqe/a;->d()Lee/b;

    move-result-object p0

    const-string v0, "Cannot return null from a non-@Nullable @Provides method"

    invoke-static {p0, v0}, Lhi/b;->c(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lee/b;

    return-object p0
.end method


# virtual methods
.method public b()Lee/b;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lee/b<",
            "Lcom/google/firebase/remoteconfig/c;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lqe/e;->a:Lqe/a;

    invoke-static {v0}, Lqe/e;->c(Lqe/a;)Lee/b;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic get()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, Lqe/e;->b()Lee/b;

    move-result-object v0

    return-object v0
.end method
