.class public final Lcom/facebook/appevents/d$b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/io/Serializable;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/facebook/appevents/d;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "b"
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/facebook/appevents/d$b$a;
    }
.end annotation


# static fields
.field public static final e:Lcom/facebook/appevents/d$b$a;

.field private static final serialVersionUID:J = 0x4b1ad70b9L


# instance fields
.field private final a:Ljava/lang/String;

.field private final b:Z

.field private final c:Z

.field private final d:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lcom/facebook/appevents/d$b$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/facebook/appevents/d$b$a;-><init>(Lkotlin/jvm/internal/g;)V

    sput-object v0, Lcom/facebook/appevents/d$b;->e:Lcom/facebook/appevents/d$b$a;

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;ZZLjava/lang/String;)V
    .locals 1

    const-string v0, "jsonString"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/n;->e(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/facebook/appevents/d$b;->a:Ljava/lang/String;

    iput-boolean p2, p0, Lcom/facebook/appevents/d$b;->b:Z

    iput-boolean p3, p0, Lcom/facebook/appevents/d$b;->c:Z

    iput-object p4, p0, Lcom/facebook/appevents/d$b;->d:Ljava/lang/String;

    return-void
.end method

.method private final readResolve()Ljava/lang/Object;
    .locals 7

    new-instance v6, Lcom/facebook/appevents/d;

    iget-object v1, p0, Lcom/facebook/appevents/d$b;->a:Ljava/lang/String;

    iget-boolean v2, p0, Lcom/facebook/appevents/d$b;->b:Z

    iget-boolean v3, p0, Lcom/facebook/appevents/d$b;->c:Z

    iget-object v4, p0, Lcom/facebook/appevents/d$b;->d:Ljava/lang/String;

    const/4 v5, 0x0

    move-object v0, v6

    invoke-direct/range {v0 .. v5}, Lcom/facebook/appevents/d;-><init>(Ljava/lang/String;ZZLjava/lang/String;Lkotlin/jvm/internal/g;)V

    return-object v6
.end method
