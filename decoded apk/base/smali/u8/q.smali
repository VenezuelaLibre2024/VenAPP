.class public final synthetic Lu8/q;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic a:Lu8/y$a;

.field public final synthetic b:Ljava/lang/String;


# direct methods
.method public synthetic constructor <init>(Lu8/y$a;Ljava/lang/String;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lu8/q;->a:Lu8/y$a;

    iput-object p2, p0, Lu8/q;->b:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    iget-object v0, p0, Lu8/q;->a:Lu8/y$a;

    iget-object v1, p0, Lu8/q;->b:Ljava/lang/String;

    invoke-static {v0, v1}, Lu8/y$a;->b(Lu8/y$a;Ljava/lang/String;)V

    return-void
.end method
