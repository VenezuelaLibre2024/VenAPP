.class public final synthetic Lo6/t;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic a:Lo6/v;


# direct methods
.method public synthetic constructor <init>(Lo6/v;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lo6/t;->a:Lo6/v;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 1

    iget-object v0, p0, Lo6/t;->a:Lo6/v;

    invoke-static {v0}, Lo6/v;->b(Lo6/v;)V

    return-void
.end method
