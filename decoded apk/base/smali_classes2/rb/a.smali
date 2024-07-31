.class public final Lrb/a;
.super Lrb/p;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lrb/a$b;
    }
.end annotation


# instance fields
.field private final a:Lrb/d;

.field private final b:Lxb/b;

.field private final c:Lxb/a;

.field private final d:Ljava/lang/Integer;


# direct methods
.method private constructor <init>(Lrb/d;Lxb/b;Lxb/a;Ljava/lang/Integer;)V
    .locals 0

    invoke-direct {p0}, Lrb/p;-><init>()V

    iput-object p1, p0, Lrb/a;->a:Lrb/d;

    iput-object p2, p0, Lrb/a;->b:Lxb/b;

    iput-object p3, p0, Lrb/a;->c:Lxb/a;

    iput-object p4, p0, Lrb/a;->d:Ljava/lang/Integer;

    return-void
.end method

.method synthetic constructor <init>(Lrb/d;Lxb/b;Lxb/a;Ljava/lang/Integer;Lrb/a$a;)V
    .locals 0

    invoke-direct {p0, p1, p2, p3, p4}, Lrb/a;-><init>(Lrb/d;Lxb/b;Lxb/a;Ljava/lang/Integer;)V

    return-void
.end method

.method public static c()Lrb/a$b;
    .locals 2

    new-instance v0, Lrb/a$b;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lrb/a$b;-><init>(Lrb/a$a;)V

    return-object v0
.end method


# virtual methods
.method public a()Lxb/a;
    .locals 1

    iget-object v0, p0, Lrb/a;->c:Lxb/a;

    return-object v0
.end method

.method public bridge synthetic b()Lrb/q;
    .locals 1

    invoke-virtual {p0}, Lrb/a;->d()Lrb/d;

    move-result-object v0

    return-object v0
.end method

.method public d()Lrb/d;
    .locals 1

    iget-object v0, p0, Lrb/a;->a:Lrb/d;

    return-object v0
.end method
