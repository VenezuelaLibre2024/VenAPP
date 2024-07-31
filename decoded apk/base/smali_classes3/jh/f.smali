.class public final synthetic Ljh/f;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic a:Ljh/g;

.field public final synthetic b:Ljh/p;


# direct methods
.method public synthetic constructor <init>(Ljh/g;Ljh/p;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ljh/f;->a:Ljh/g;

    iput-object p2, p0, Ljh/f;->b:Ljh/p;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    iget-object v0, p0, Ljh/f;->a:Ljh/g;

    iget-object v1, p0, Ljh/f;->b:Ljh/p;

    invoke-static {v0, v1}, Ljh/g;->a(Ljh/g;Ljh/p;)V

    return-void
.end method
