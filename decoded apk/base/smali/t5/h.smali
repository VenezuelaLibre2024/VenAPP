.class public final synthetic Lt5/h;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic a:Lok/a;


# direct methods
.method public synthetic constructor <init>(Lok/a;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lt5/h;->a:Lok/a;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 1

    iget-object v0, p0, Lt5/h;->a:Lok/a;

    invoke-static {v0}, Lt5/g$b;->a(Lok/a;)V

    return-void
.end method
