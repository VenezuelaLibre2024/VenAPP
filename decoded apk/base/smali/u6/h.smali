.class public final synthetic Lu6/h;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic a:Lu6/n1;


# direct methods
.method public synthetic constructor <init>(Lu6/n1;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lu6/h;->a:Lu6/n1;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 1

    iget-object v0, p0, Lu6/h;->a:Lu6/n1;

    invoke-static {v0}, Lu6/n1;->O(Lu6/n1;)V

    return-void
.end method
