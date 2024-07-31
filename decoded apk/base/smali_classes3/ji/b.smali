.class public final synthetic Lji/b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic a:Lji/d;


# direct methods
.method public synthetic constructor <init>(Lji/d;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lji/b;->a:Lji/d;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 1

    iget-object v0, p0, Lji/b;->a:Lji/d;

    invoke-static {v0}, Lji/d;->a(Lji/d;)V

    return-void
.end method
