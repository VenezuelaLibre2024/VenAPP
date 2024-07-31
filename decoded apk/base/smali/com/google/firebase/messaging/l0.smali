.class public abstract Lcom/google/firebase/messaging/l0;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static final a:Lmd/h;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    invoke-static {}, Lmd/h;->a()Lmd/h$a;

    move-result-object v0

    sget-object v1, Lcom/google/firebase/messaging/a;->a:Lkd/a;

    invoke-virtual {v0, v1}, Lmd/h$a;->c(Lkd/a;)Lmd/h$a;

    move-result-object v0

    invoke-virtual {v0}, Lmd/h$a;->b()Lmd/h;

    move-result-object v0

    sput-object v0, Lcom/google/firebase/messaging/l0;->a:Lmd/h;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static a(Ljava/lang/Object;)[B
    .locals 1

    sget-object v0, Lcom/google/firebase/messaging/l0;->a:Lmd/h;

    invoke-virtual {v0, p0}, Lmd/h;->c(Ljava/lang/Object;)[B

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public abstract b()Lme/b;
.end method
