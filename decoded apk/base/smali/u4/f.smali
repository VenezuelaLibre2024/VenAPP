.class public final synthetic Lu4/f;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic a:Lu4/g;


# direct methods
.method public synthetic constructor <init>(Lu4/g;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lu4/f;->a:Lu4/g;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 1

    iget-object v0, p0, Lu4/f;->a:Lu4/g;

    invoke-static {v0}, Lu4/g;->a(Lu4/g;)V

    return-void
.end method
