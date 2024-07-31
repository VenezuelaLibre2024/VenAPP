.class public final synthetic Lhh/d;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic a:Lhh/e$a;

.field public final synthetic b:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Lhh/e$a;Ljava/lang/Object;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lhh/d;->a:Lhh/e$a;

    iput-object p2, p0, Lhh/d;->b:Ljava/lang/Object;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    iget-object v0, p0, Lhh/d;->a:Lhh/e$a;

    iget-object v1, p0, Lhh/d;->b:Ljava/lang/Object;

    invoke-static {v0, v1}, Lhh/e$a;->b(Lhh/e$a;Ljava/lang/Object;)V

    return-void
.end method
