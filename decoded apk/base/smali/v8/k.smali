.class public final synthetic Lv8/k;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic a:Lv8/l;


# direct methods
.method public synthetic constructor <init>(Lv8/l;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lv8/k;->a:Lv8/l;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 1

    iget-object v0, p0, Lv8/k;->a:Lv8/l;

    invoke-static {v0}, Lv8/l;->b(Lv8/l;)V

    return-void
.end method
