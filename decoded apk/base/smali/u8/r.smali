.class public final synthetic Lu8/r;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic a:Lu8/y$a;

.field public final synthetic b:Lu8/a0;


# direct methods
.method public synthetic constructor <init>(Lu8/y$a;Lu8/a0;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lu8/r;->a:Lu8/y$a;

    iput-object p2, p0, Lu8/r;->b:Lu8/a0;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    iget-object v0, p0, Lu8/r;->a:Lu8/y$a;

    iget-object v1, p0, Lu8/r;->b:Lu8/a0;

    invoke-static {v0, v1}, Lu8/y$a;->h(Lu8/y$a;Lu8/a0;)V

    return-void
.end method
