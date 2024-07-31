.class public final synthetic Landroidx/camera/lifecycle/d;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements La0/a;


# instance fields
.field public final synthetic a:Lw/v;


# direct methods
.method public synthetic constructor <init>(Lw/v;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Landroidx/camera/lifecycle/d;->a:Lw/v;

    return-void
.end method


# virtual methods
.method public final apply(Ljava/lang/Object;)Lcom/google/common/util/concurrent/f;
    .locals 1

    iget-object v0, p0, Landroidx/camera/lifecycle/d;->a:Lw/v;

    check-cast p1, Ljava/lang/Void;

    invoke-static {v0, p1}, Landroidx/camera/lifecycle/e;->a(Lw/v;Ljava/lang/Void;)Lcom/google/common/util/concurrent/f;

    move-result-object p1

    return-object p1
.end method
