.class public final Lbe/y;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lrd/b;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lrd/b<",
        "Ljava/lang/String;",
        ">;"
    }
.end annotation


# instance fields
.field private final a:Lbe/w;


# direct methods
.method public constructor <init>(Lbe/w;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lbe/y;->a:Lbe/w;

    return-void
.end method

.method public static a(Lbe/w;)Lbe/y;
    .locals 1

    new-instance v0, Lbe/y;

    invoke-direct {v0, p0}, Lbe/y;-><init>(Lbe/w;)V

    return-object v0
.end method

.method public static c(Lbe/w;)Ljava/lang/String;
    .locals 0

    invoke-virtual {p0}, Lbe/w;->b()Ljava/lang/String;

    move-result-object p0

    invoke-static {p0}, Lrd/d;->e(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ljava/lang/String;

    return-object p0
.end method


# virtual methods
.method public b()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lbe/y;->a:Lbe/w;

    invoke-static {v0}, Lbe/y;->c(Lbe/w;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic get()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, Lbe/y;->b()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
