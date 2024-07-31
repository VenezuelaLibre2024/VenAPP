.class public final Lbe/a0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lrd/b;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lrd/b<",
        "Lvi/w0;",
        ">;"
    }
.end annotation


# instance fields
.field private final a:Lbe/z;


# direct methods
.method public constructor <init>(Lbe/z;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lbe/a0;->a:Lbe/z;

    return-void
.end method

.method public static a(Lbe/z;)Lbe/a0;
    .locals 1

    new-instance v0, Lbe/a0;

    invoke-direct {v0, p0}, Lbe/a0;-><init>(Lbe/z;)V

    return-object v0
.end method

.method public static c(Lbe/z;)Lvi/w0;
    .locals 0

    invoke-virtual {p0}, Lbe/z;->b()Lvi/w0;

    move-result-object p0

    invoke-static {p0}, Lrd/d;->e(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lvi/w0;

    return-object p0
.end method


# virtual methods
.method public b()Lvi/w0;
    .locals 1

    iget-object v0, p0, Lbe/a0;->a:Lbe/z;

    invoke-static {v0}, Lbe/a0;->c(Lbe/z;)Lvi/w0;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic get()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, Lbe/a0;->b()Lvi/w0;

    move-result-object v0

    return-object v0
.end method
