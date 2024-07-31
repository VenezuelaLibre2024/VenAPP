.class public final Lpe/a$b;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lpe/a;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "b"
.end annotation


# instance fields
.field private a:Lqe/a;


# direct methods
.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method synthetic constructor <init>(Lpe/a$a;)V
    .locals 0

    invoke-direct {p0}, Lpe/a$b;-><init>()V

    return-void
.end method


# virtual methods
.method public a()Lpe/b;
    .locals 3

    iget-object v0, p0, Lpe/a$b;->a:Lqe/a;

    const-class v1, Lqe/a;

    invoke-static {v0, v1}, Lhi/b;->a(Ljava/lang/Object;Ljava/lang/Class;)V

    new-instance v0, Lpe/a;

    iget-object v1, p0, Lpe/a$b;->a:Lqe/a;

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lpe/a;-><init>(Lqe/a;Lpe/a$a;)V

    return-object v0
.end method

.method public b(Lqe/a;)Lpe/a$b;
    .locals 0

    invoke-static {p1}, Lhi/b;->b(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lqe/a;

    iput-object p1, p0, Lpe/a$b;->a:Lqe/a;

    return-object p0
.end method
