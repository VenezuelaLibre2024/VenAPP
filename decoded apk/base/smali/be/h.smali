.class public final Lbe/h;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lrd/b;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lrd/b<",
        "Lfe/f;",
        ">;"
    }
.end annotation


# instance fields
.field private final a:Lbe/d;


# direct methods
.method public constructor <init>(Lbe/d;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lbe/h;->a:Lbe/d;

    return-void
.end method

.method public static a(Lbe/d;)Lbe/h;
    .locals 1

    new-instance v0, Lbe/h;

    invoke-direct {v0, p0}, Lbe/h;-><init>(Lbe/d;)V

    return-object v0
.end method

.method public static c(Lbe/d;)Lfe/f;
    .locals 0

    invoke-virtual {p0}, Lbe/d;->d()Lfe/f;

    move-result-object p0

    invoke-static {p0}, Lrd/d;->e(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lfe/f;

    return-object p0
.end method


# virtual methods
.method public b()Lfe/f;
    .locals 1

    iget-object v0, p0, Lbe/h;->a:Lbe/d;

    invoke-static {v0}, Lbe/h;->c(Lbe/d;)Lfe/f;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic get()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, Lbe/h;->b()Lfe/f;

    move-result-object v0

    return-object v0
.end method
