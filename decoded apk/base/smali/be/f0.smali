.class public final Lbe/f0;
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
.field private final a:Lbe/e0;


# direct methods
.method public constructor <init>(Lbe/e0;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lbe/f0;->a:Lbe/e0;

    return-void
.end method

.method public static a(Lbe/e0;)Lbe/f0;
    .locals 1

    new-instance v0, Lbe/f0;

    invoke-direct {v0, p0}, Lbe/f0;-><init>(Lbe/e0;)V

    return-object v0
.end method

.method public static c(Lbe/e0;)Lij/a;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lbe/e0;",
            ")",
            "Lij/a<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    invoke-virtual {p0}, Lbe/e0;->e()Lij/a;

    move-result-object p0

    invoke-static {p0}, Lrd/d;->e(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lij/a;

    return-object p0
.end method


# virtual methods
.method public b()Lij/a;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lij/a<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lbe/f0;->a:Lbe/e0;

    invoke-static {v0}, Lbe/f0;->c(Lbe/e0;)Lij/a;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic get()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, Lbe/f0;->b()Lij/a;

    move-result-object v0

    return-object v0
.end method
