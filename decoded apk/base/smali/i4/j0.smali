.class public final synthetic Li4/j0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic a:Ljava/util/ArrayList;

.field public final synthetic b:Li4/m0;


# direct methods
.method public synthetic constructor <init>(Ljava/util/ArrayList;Li4/m0;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Li4/j0;->a:Ljava/util/ArrayList;

    iput-object p2, p0, Li4/j0;->b:Li4/m0;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    iget-object v0, p0, Li4/j0;->a:Ljava/util/ArrayList;

    iget-object v1, p0, Li4/j0;->b:Li4/m0;

    invoke-static {v0, v1}, Li4/i0$c;->a(Ljava/util/ArrayList;Li4/m0;)V

    return-void
.end method
