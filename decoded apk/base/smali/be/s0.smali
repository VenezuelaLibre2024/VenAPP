.class public final Lbe/s0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lrd/b;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lrd/b<",
        "Lce/a;",
        ">;"
    }
.end annotation


# instance fields
.field private final a:Lbe/r0;


# direct methods
.method public constructor <init>(Lbe/r0;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lbe/s0;->a:Lbe/r0;

    return-void
.end method

.method public static a(Lbe/r0;)Lbe/s0;
    .locals 1

    new-instance v0, Lbe/s0;

    invoke-direct {v0, p0}, Lbe/s0;-><init>(Lbe/r0;)V

    return-object v0
.end method

.method public static c(Lbe/r0;)Lce/a;
    .locals 0

    invoke-virtual {p0}, Lbe/r0;->a()Lce/a;

    move-result-object p0

    invoke-static {p0}, Lrd/d;->e(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lce/a;

    return-object p0
.end method


# virtual methods
.method public b()Lce/a;
    .locals 1

    iget-object v0, p0, Lbe/s0;->a:Lbe/r0;

    invoke-static {v0}, Lbe/s0;->c(Lbe/r0;)Lce/a;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic get()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, Lbe/s0;->b()Lce/a;

    move-result-object v0

    return-object v0
.end method
