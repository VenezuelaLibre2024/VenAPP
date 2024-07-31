.class public final synthetic Ljh/b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic a:Ljh/a$b;


# direct methods
.method public synthetic constructor <init>(Ljh/a$b;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ljh/b;->a:Ljh/a$b;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 1

    iget-object v0, p0, Ljh/b;->a:Ljh/a$b;

    invoke-static {v0}, Ljh/a$b;->a(Ljh/a$b;)V

    return-void
.end method
