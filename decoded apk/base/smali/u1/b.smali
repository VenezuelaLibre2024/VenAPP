.class public final synthetic Lu1/b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroidx/lifecycle/i;


# instance fields
.field public final synthetic a:Landroidx/savedstate/a;


# direct methods
.method public synthetic constructor <init>(Landroidx/savedstate/a;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lu1/b;->a:Landroidx/savedstate/a;

    return-void
.end method


# virtual methods
.method public final onStateChanged(Landroidx/lifecycle/k;Landroidx/lifecycle/f$a;)V
    .locals 1

    iget-object v0, p0, Lu1/b;->a:Landroidx/savedstate/a;

    invoke-static {v0, p1, p2}, Landroidx/savedstate/a;->a(Landroidx/savedstate/a;Landroidx/lifecycle/k;Landroidx/lifecycle/f$a;)V

    return-void
.end method
