.class public final Lbe/i;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lrd/b;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lrd/b<",
        "Lzd/q3;",
        ">;"
    }
.end annotation


# instance fields
.field private final a:Lbe/d;


# direct methods
.method public constructor <init>(Lbe/d;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lbe/i;->a:Lbe/d;

    return-void
.end method

.method public static a(Lbe/d;)Lbe/i;
    .locals 1

    new-instance v0, Lbe/i;

    invoke-direct {v0, p0}, Lbe/i;-><init>(Lbe/d;)V

    return-object v0
.end method

.method public static c(Lbe/d;)Lzd/q3;
    .locals 0

    invoke-virtual {p0}, Lbe/d;->e()Lzd/q3;

    move-result-object p0

    invoke-static {p0}, Lrd/d;->e(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lzd/q3;

    return-object p0
.end method


# virtual methods
.method public b()Lzd/q3;
    .locals 1

    iget-object v0, p0, Lbe/i;->a:Lbe/d;

    invoke-static {v0}, Lbe/i;->c(Lbe/d;)Lzd/q3;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic get()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, Lbe/i;->b()Lzd/q3;

    move-result-object v0

    return-object v0
.end method
