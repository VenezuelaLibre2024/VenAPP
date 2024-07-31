.class public final Lbe/g;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lrd/b;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lrd/b<",
        "Lzb/g;",
        ">;"
    }
.end annotation


# instance fields
.field private final a:Lbe/d;


# direct methods
.method public constructor <init>(Lbe/d;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lbe/g;->a:Lbe/d;

    return-void
.end method

.method public static a(Lbe/d;)Lbe/g;
    .locals 1

    new-instance v0, Lbe/g;

    invoke-direct {v0, p0}, Lbe/g;-><init>(Lbe/d;)V

    return-object v0
.end method

.method public static c(Lbe/d;)Lzb/g;
    .locals 0

    invoke-virtual {p0}, Lbe/d;->c()Lzb/g;

    move-result-object p0

    invoke-static {p0}, Lrd/d;->e(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lzb/g;

    return-object p0
.end method


# virtual methods
.method public b()Lzb/g;
    .locals 1

    iget-object v0, p0, Lbe/g;->a:Lbe/d;

    invoke-static {v0}, Lbe/g;->c(Lbe/d;)Lzb/g;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic get()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, Lbe/g;->b()Lzb/g;

    move-result-object v0

    return-object v0
.end method
