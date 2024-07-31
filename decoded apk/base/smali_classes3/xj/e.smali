.class public final Lxj/e;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljj/d;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Ljj/d<",
        "Lgj/b;",
        ">;"
    }
.end annotation


# instance fields
.field public a:Lgj/b;


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Lgj/b;)V
    .locals 0

    iput-object p1, p0, Lxj/e;->a:Lgj/b;

    return-void
.end method

.method public bridge synthetic accept(Ljava/lang/Object;)V
    .locals 0

    check-cast p1, Lgj/b;

    invoke-virtual {p0, p1}, Lxj/e;->a(Lgj/b;)V

    return-void
.end method
