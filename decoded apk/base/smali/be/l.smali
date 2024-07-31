.class public final Lbe/l;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lrd/b;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lrd/b<",
        "Lcc/a;",
        ">;"
    }
.end annotation


# instance fields
.field private final a:Lbe/k;


# direct methods
.method public constructor <init>(Lbe/k;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lbe/l;->a:Lbe/k;

    return-void
.end method

.method public static a(Lbe/k;)Lbe/l;
    .locals 1

    new-instance v0, Lbe/l;

    invoke-direct {v0, p0}, Lbe/l;-><init>(Lbe/k;)V

    return-object v0
.end method

.method public static c(Lbe/k;)Lcc/a;
    .locals 0

    invoke-virtual {p0}, Lbe/k;->a()Lcc/a;

    move-result-object p0

    invoke-static {p0}, Lrd/d;->e(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lcc/a;

    return-object p0
.end method


# virtual methods
.method public b()Lcc/a;
    .locals 1

    iget-object v0, p0, Lbe/l;->a:Lbe/k;

    invoke-static {v0}, Lbe/l;->c(Lbe/k;)Lcc/a;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic get()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, Lbe/l;->b()Lcc/a;

    move-result-object v0

    return-object v0
.end method
