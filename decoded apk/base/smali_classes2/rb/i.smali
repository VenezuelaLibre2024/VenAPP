.class public final Lrb/i;
.super Lrb/p;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lrb/i$b;
    }
.end annotation


# instance fields
.field private final a:Lrb/l;

.field private final b:Lxb/b;

.field private final c:Lxb/a;

.field private final d:Ljava/lang/Integer;


# direct methods
.method private constructor <init>(Lrb/l;Lxb/b;Lxb/a;Ljava/lang/Integer;)V
    .locals 0

    invoke-direct {p0}, Lrb/p;-><init>()V

    iput-object p1, p0, Lrb/i;->a:Lrb/l;

    iput-object p2, p0, Lrb/i;->b:Lxb/b;

    iput-object p3, p0, Lrb/i;->c:Lxb/a;

    iput-object p4, p0, Lrb/i;->d:Ljava/lang/Integer;

    return-void
.end method

.method synthetic constructor <init>(Lrb/l;Lxb/b;Lxb/a;Ljava/lang/Integer;Lrb/i$a;)V
    .locals 0

    invoke-direct {p0, p1, p2, p3, p4}, Lrb/i;-><init>(Lrb/l;Lxb/b;Lxb/a;Ljava/lang/Integer;)V

    return-void
.end method

.method public static c()Lrb/i$b;
    .locals 2

    new-instance v0, Lrb/i$b;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lrb/i$b;-><init>(Lrb/i$a;)V

    return-object v0
.end method


# virtual methods
.method public a()Lxb/a;
    .locals 1

    iget-object v0, p0, Lrb/i;->c:Lxb/a;

    return-object v0
.end method

.method public bridge synthetic b()Lrb/q;
    .locals 1

    invoke-virtual {p0}, Lrb/i;->d()Lrb/l;

    move-result-object v0

    return-object v0
.end method

.method public d()Lrb/l;
    .locals 1

    iget-object v0, p0, Lrb/i;->a:Lrb/l;

    return-object v0
.end method
